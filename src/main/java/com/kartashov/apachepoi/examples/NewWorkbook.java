package com.kartashov.apachepoi.examples;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class NewWorkbook {

    public static void main(String[] args) throws IOException {
        Workbook wb1 = new HSSFWorkbook();
        FileOutputStream fileOut1 = new FileOutputStream("workbook.xls");
        wb1.write(fileOut1);
        fileOut1.close();

        Workbook wb2 = new XSSFWorkbook();
        FileOutputStream fileOut2 = new FileOutputStream("workbook.xlsx");
        wb2.write(fileOut2);
        fileOut2.close();
    }
}
