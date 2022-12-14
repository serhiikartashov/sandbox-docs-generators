package com.kartashov.apachepoi.examples;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut;
        try (Workbook wb = new HSSFWorkbook()) {
            wb.createSheet("new sheet");
            wb.createSheet("second sheet");

            // Note that sheet name is Excel must not exceed 31 characters
            // and must not contain any of the following characters:
            // 0x0000
            // 0x0003
            // colon (:)
            // backslash (\)
            // asterisk (*)
            // question mark (?)
            // forward slash (/)
            // opening square bracket ([)
            // closing square bracket (])

            // You can use org.apache.poi.ss.util.WorkbookUtil#createSafeSheetName(String nameProposal)}
            // for a safe way to create valid names, this utility replaces invalid characters with a space (' ')
            String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]"); // returns " O'Brien's sales   "
            wb.createSheet(safeName);

            fileOut = new FileOutputStream("workbook.xls");
            wb.write(fileOut);
        }  // or new XSSFWorkbook();
        fileOut.close();
    }
}
