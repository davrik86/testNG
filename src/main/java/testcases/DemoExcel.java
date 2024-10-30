package testcases;

import Utilities.excelUtils;

public class DemoExcel {


    public static void main(String[] args) {

        excelUtils.getExcelInstance("ExcelDataSet/data.xlsx","Sheet1");
        System.out.println("Row count is: " +excelUtils.getRowcount());
        System.out.println("Col count is: " +excelUtils.getColumnCount());
        System.out.println(excelUtils.getCellDataString(0,0));//username
        System.out.println(excelUtils.getCellDataString(1,0));//username
        System.out.println(excelUtils.getCellDataString(2,0));//username
        int rowCount= excelUtils.getRowcount();
        int colCount= excelUtils.getColumnCount();
        for(int i=0; i<=rowCount;i++){
            for (int j = 0; j < colCount; j++) {
                System.out.print(excelUtils.getCellDataString(i,j)+ "  |  ");
            }
            System.out.println();

        }




    }
}
