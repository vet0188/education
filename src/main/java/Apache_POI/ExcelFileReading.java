package Apache_POI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileReading {
    FileInputStream file = new FileInputStream("/Users/vitaliy_khairutdinov/IdeaProjects/id_01/Rules_IF_Condition.xlsx");

    public ExcelFileReading() throws FileNotFoundException {
        System.out.println("file " + file + "not found");
    }

    public void readDataFromCell(String sheet, int rowNum, int colNum) throws IOException
    {
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet worksheet = workbook.getSheet(sheet);
        XSSFRow row = worksheet.getRow(rowNum);
        XSSFCell cell = row.getCell(colNum);
        System.out.println(cell.getStringCellValue());
    }
    public void rowsCount (String sheet, boolean index) throws IOException
    {
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet worksheet = workbook.getSheet(sheet);
        int rowNumber = worksheet.getPhysicalNumberOfRows();
        int lastRowIndex = worksheet.getLastRowNum();
        if (index) System.out.println("Last row index - " + lastRowIndex);
        else System.out.println(rowNumber + "rows");
    }
    public void cellCount (String sheet, int rowNum) throws IOException
    {
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet worksheet = workbook.getSheet(sheet);
        XSSFRow row = worksheet.getRow(rowNum);
        int cellNum = row.getPhysicalNumberOfCells();
        System.out.println("Row " + rowNum + "contains " + cellNum + "cells");
    }
    public void readAllDataFromCell(String sheet) throws IOException
    {
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet worksheet = workbook.getSheet(sheet);
        int rowNumber = worksheet.getPhysicalNumberOfRows();
        for (int rowNum = 0; rowNum < rowNumber; rowNum++)
        {
            XSSFRow row = worksheet.getRow(rowNum);
            int cellNum = row.getPhysicalNumberOfCells();
            for (int cell = 0; cell < cellNum; cell++) {
                XSSFCell cellData = row.getCell(cell);
                System.out.print(cellData.getStringCellValue() + ",");
            }
            System.out.println();
        }
    }
}
