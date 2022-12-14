package com.kartashov.apachepoi.examples;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example20 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut;
        try (Workbook wb = new HSSFWorkbook()) {
            wb.createSheet("Sheet1");
            //sets the print area for the first sheet
            wb.setPrintArea(0, "$A$1:$C$2");

            //Alternatively:
            wb.setPrintArea(
                    0, //sheet index
                    0, //start column
                    1, //end column
                    0, //start row
                    0  //end row
            );

            fileOut = new FileOutputStream("workbook.xls");
            wb.write(fileOut);
        }
        fileOut.close();
    }
}
