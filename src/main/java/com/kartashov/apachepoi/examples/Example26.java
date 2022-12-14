package com.kartashov.apachepoi.examples;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.PaneType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example26 {

    public static void main(String[] args) throws IOException {
        try (Workbook wb = new HSSFWorkbook()) {
            Sheet sheet1 = wb.createSheet("new sheet");
            Sheet sheet2 = wb.createSheet("second sheet");
            Sheet sheet3 = wb.createSheet("third sheet");
            Sheet sheet4 = wb.createSheet("fourth sheet");

            // Freeze just one row
            sheet1.createFreezePane(0, 1, 0, 1);
            // Freeze just one column
            sheet2.createFreezePane(1, 0, 1, 0);
            // Freeze the columns and rows (forget about scrolling position of the lower right quadrant).
            sheet3.createFreezePane(2, 2);
            // Create a split with the lower left side being the active quadrant
            sheet4.createSplitPane(2000, 2000, 0, 0, PaneType.LOWER_LEFT);

            try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
                wb.write(fileOut);
            }
        }
    }
}
