package com.kartashov.apachepoi.examples;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut1;
        try (Workbook wb1 = new HSSFWorkbook()) {
            fileOut1 = new FileOutputStream("workbook.xls");
            wb1.write(fileOut1);
        }
        fileOut1.close();

        FileOutputStream fileOut2;
        try (Workbook wb2 = new XSSFWorkbook()) {
            fileOut2 = new FileOutputStream("workbook.xlsx");
            wb2.write(fileOut2);
        }
        fileOut2.close();
    }
}
