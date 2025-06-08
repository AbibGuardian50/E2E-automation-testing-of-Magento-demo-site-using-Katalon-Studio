package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook

class EncryptPasswordExcel {

	@Keyword
	def encryptPasswordsInExcel(String inputFilePath, String outputFilePath) {
		FileInputStream fis = new FileInputStream(new File(inputFilePath))
		Workbook workbook = new XSSFWorkbook(fis)
		Sheet sheet = workbook.getSheetAt(0)

		Row headerRow = sheet.getRow(0)
		int passwordColIndex = -1

		for (int i = 0; i < headerRow.getLastCellNum(); i++) {
			String cellValue = headerRow.getCell(i).getStringCellValue().trim()
			if (cellValue.equalsIgnoreCase("Password")) {
				passwordColIndex = i
				break
			}
		}

		if (passwordColIndex == -1) {
			println "Kolom 'Password' tidak ditemukan!"
			return
		}

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i)
			Cell passwordCell = row.getCell(passwordColIndex)

			if (passwordCell != null && passwordCell.getCellType() == CellType.STRING) {
				String plainPassword = passwordCell.getStringCellValue()
				String encryptedPassword = WebUI.encrypt(plainPassword)
				passwordCell.setCellValue(encryptedPassword)
			}
		}

		fis.close()

		FileOutputStream fos = new FileOutputStream(new File(outputFilePath))
		workbook.write(fos)
		fos.close()
		workbook.close()

		println "✅ Password terenkripsi dan disimpan ke: ${outputFilePath}"
	}
}
