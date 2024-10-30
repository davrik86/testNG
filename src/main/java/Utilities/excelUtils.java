package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.IOException;

public class excelUtils {

    static XSSFWorkbook workbook;

    static XSSFSheet sheet;

    /**
     *
     * @param filepath the path of the exceel file
     * @param sheetName the sheet name inside the woorkbook, exmpl, "Sheet1"
     */

    public static void getExcelInstance(String filepath, String sheetName){

        try {
            workbook= new XSSFWorkbook(filepath);
            sheet=workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     *
     * @return thu number of the rows in Excel Sheet
     */
    public static int getRowcount(){
        int rowCount= sheet.getPhysicalNumberOfRows();//
        return rowCount;
    }

    /**
     *
     * @return the number of the column in Excel Sheet
     */
    public static  int getColumnCount(){
        int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
        return colCount;
    }

    /**
     *
     * @param rowNumber the row number the cell is located
     * @param columnNumber the column number the cell is located
     * @return The value of the cell at the spesific
     */
    public static String getCellDataString(int rowNumber, int columnNumber){
        String cellData=sheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
        return cellData;
    }

    /**
     *
     * @return this returns two additional array of the Excel sheet
     */

    public static Object[][] getDataSet(){
        int rowCount= excelUtils.getRowcount();
        int colCount= excelUtils.getColumnCount();

        Object[][] data =new Object[rowCount][colCount];
        for(int i=0; i<rowCount;i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData= excelUtils.getCellDataString(i,j);
                data[i][j]=cellData;
            }

        }
            return data;
    }


}
