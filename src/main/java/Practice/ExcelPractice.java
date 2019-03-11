package Practice;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelPractice {
    // Initiate connection to read and write file
    FileOutputStream writeFile = new FileOutputStream("/Users/vitaliy_khairutdinov/IdeaProjects/id_01/Result.xlsx");
    XSSFWorkbook writeWK = new XSSFWorkbook();
    XSSFSheet writeSheet = writeWK.createSheet("Result2");
    FileInputStream readFile = new FileInputStream("/Users/vitaliy_khairutdinov/IdeaProjects/id_01/Rules_IF_Condition.xlsx");
    XSSFWorkbook readWK = new XSSFWorkbook(readFile);
    // Initiate global vars to handle data for writing
    String cellValueString;
    double cellValueInt;
    boolean cellValueBool;
    XSSFCellStyle style = writeWK.createCellStyle();
    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    style.setFillPattern(CellStyle.SOLID_FOREGROUND);

    public ExcelPractice() throws IOException {

    }

    public  void cloneDataFromFile () throws IOException
    {

        XSSFSheet sheet = readWK.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
        {
                XSSFRow row = sheet.getRow(rowIndex);
                int cellCount = row.getPhysicalNumberOfCells();
                createRow(rowIndex);
                for (int cellIndex = 0; cellIndex < cellCount; cellIndex++) {
                        XSSFCell cell = row.getCell(cellIndex);
                    if (cell.getCellType()==1)
                        {
                            cellValueString = cell.getStringCellValue();
                            writeDataToFile(rowIndex,cellIndex, cellValueString);
                        }
                        else if (cell.getCellType()==0)
                        {
                            cellValueInt = cell.getNumericCellValue();
                            writeDataToFile(rowIndex, cellIndex, cellValueInt);
                        }
                        else if (cell.getCellType()==4)
                        {
                            cellValueBool = cell.getBooleanCellValue();
                            writeDataToFile(rowIndex, cellIndex, cellValueBool);
                        }


            }
        }
        writeWK.write(writeFile);
        writeWK.close();
    }
    public void createRow (int rowIndex) throws IOException
    {
        XSSFRow writeRow = writeSheet.createRow(rowIndex);
        XSSFCell cell = writeRow.createCell(0);
        cell.setCellValue("");
    }
    void writeDataToFile(int rowIndex,int cellIndex, String data) throws IOException
    {
         XSSFRow writeRow = writeSheet.getRow(rowIndex);
        XSSFCell cell = writeRow.createCell(cellIndex);
        cell.setCellValue(data);
    }
     void writeDataToFile (int rowIndex,int cellIndex, double data) throws IOException
    {
        XSSFRow writeRow = writeSheet.getRow(rowIndex);
        XSSFCell cell = writeRow.createCell(cellIndex);
        cell.setCellValue(data);
    }
     void writeDataToFile (int rowIndex,int cellIndex, boolean data) throws IOException
    {
        XSSFRow writeRow = writeSheet.getRow(rowIndex);
        XSSFCell cell = writeRow.createCell(cellIndex);
        cell.setCellValue(data);
    }
    public void compareDataInTwoFiles ()
    {
        boolean equal = false;
        XSSFSheet sheetFile1 = readWK.getSheet("Sheet1");
        XSSFSheet sheetFile2 = writeWK.getSheet("Result2");
        int rowCounterF1 = sheetFile1.getPhysicalNumberOfRows();
        int rowCounterF2 = sheetFile2.getPhysicalNumberOfRows();
            for (int rowIndex = 0; rowIndex <= rowCounterF1; rowIndex++) {
                XSSFRow rowF1 = sheetFile1.getRow(rowIndex);
                XSSFRow rowF2 = sheetFile2.getRow(rowIndex);
                int cellCounterF1 = rowF1.getPhysicalNumberOfCells();
                int cellCounterF2 = rowF2.getPhysicalNumberOfCells();
                if (rowIndex <= rowCounterF2) {
                    for (int cellIndex = 0; cellIndex <= cellCounterF1; cellIndex++) {
                        XSSFCell cellF1 = rowF1.getCell(cellIndex);
                        XSSFCell cellF2 = rowF2.getCell(cellIndex);
                        if (cellIndex <= cellCounterF2) {
                            if (cellF1.toString().compareTo(cellF2.toString()) != 0) cellF2.setCellStyle(style);
                        }
                        cellF2.setCellStyle(style);
                    }
                }
                rowF2.setRowStyle(style);
            }
    }
    // TO DO Sometime
    public void readFromOneSheetWriteToAnother(){
        // Implement method
    }
    public void readDataAndSkipErrors(){
        // implement method
    }
    public void displayDataAlongWithRowAndCellIndex() {
        // Implement method
    }
    public void displayMismatchRowAndCellIndexe() {
        // Implement method
    }

}
