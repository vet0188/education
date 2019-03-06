package Apache_POI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileWriting {
    FileOutputStream file = new FileOutputStream("/Users/vitaliy_khairutdinov/IdeaProjects/id_01/Result.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Result");

    public ExcelFileWriting() throws FileNotFoundException {
    }
    public void writeData (int rowNum, int colNum) throws IOException
    {
        XSSFRow row = sheet.createRow(rowNum);
        XSSFCell cell = row.createCell(colNum);
        cell.setCellValue("Some test string");
        workbook.write(file);
        workbook.close();
    }
}
