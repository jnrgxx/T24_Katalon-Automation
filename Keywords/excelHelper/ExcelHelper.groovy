package excelHelper

import com.kms.katalon.core.annotation.Keyword
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import java.io.FileInputStream
import java.io.FileOutputStream

class ExcelHelper {
    @Keyword
    def updateCell(String filePath, String sheetName, int rowIndex, int colIndex, String value) {
        FileInputStream fis = new FileInputStream(filePath)
        XSSFWorkbook workbook = new XSSFWorkbook(fis)
        Sheet sheet = workbook.getSheet(sheetName)

        Row row = sheet.getRow(rowIndex - 1) // Excel rows are 0-based
        if (row == null) {
            row = sheet.createRow(rowIndex - 1)
        }

        Cell cell = row.getCell(colIndex - 1)
        if (cell == null) {
            cell = row.createCell(colIndex - 1)
        }

        cell.setCellValue(value)

        fis.close()
        FileOutputStream fos = new FileOutputStream(filePath)
        workbook.write(fos)
        fos.close()
        workbook.close()
    }
}
