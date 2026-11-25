package TestKp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

    public static Object[][] getTestData(String filepath, String sheetname)
            throws IOException {

        FileInputStream fis = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet(sheetname);

        if (sheet == null) {
            System.out.println("Sheet not found: " + sheetname);
            System.out.println("Available sheets:");

            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                System.out.println(workbook.getSheetName(i));
            }

            workbook.close();
            fis.close();

            throw new IllegalArgumentException(
                    "Please check the Excel worksheet name.");
        }

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows][cols];

        DataFormatter formatter = new DataFormatter();

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] =
                        formatter.formatCellValue(sheet.getRow(i).getCell(j));
            }
        }

        workbook.close();
        fis.close();

        return data;
    }
}