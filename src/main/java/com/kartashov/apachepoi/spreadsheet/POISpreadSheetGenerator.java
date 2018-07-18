package com.kartashov.apachepoi.spreadsheet;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import static com.kartashov.Util.sounds;

public class POISpreadSheetGenerator {

    public static void main(String[] args) throws IOException {
        String[] list = sounds;

        int columns = 8;
        int rows = 17;

        Workbook wb = new XSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        for (int k = 0; k < 15; k++) {
            Sheet sheet = wb.createSheet("random kana" + k);
            wb.setPrintArea(k, "$A$1:$P$"+ rows*2);

            for (int i = 0; i < columns*2; i++) {
                sheet.setColumnWidth(i, 1473);
            }
            sheet.setDefaultRowHeight((short) 300);

            for (int i = 0; i < rows*2-1; i = i + 2) {
                for (int j = 0; j < columns; j++) {
                    sheet.addMergedRegion(new CellRangeAddress(
                            i, //first row (0-based)
                            i, //last row  (0-based)
                            j * 2, //first column (0-based)
                            j * 2 + 1  //last column  (0-based)
                    ));
                }
            }

            CellStyle cellStyle = wb.createCellStyle();
            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            cellStyle.setVerticalAlignment(VerticalAlignment.BOTTOM);
            cellStyle.setBorderBottom(BorderStyle.THIN);
            cellStyle.setBorderLeft(BorderStyle.THIN);
            cellStyle.setBorderRight(BorderStyle.THIN);
            cellStyle.setBorderTop(BorderStyle.THIN);
            cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());

            for (int i = 0; i < rows*2; i = i + 2) {
                Row row = sheet.createRow(i + 1);
                row.setRowStyle(cellStyle);
                row.setHeight((short) 600);
            }

            for (int i = 0; i < rows*2; i = i + 2) {
                Row row = sheet.createRow(i);
                row.setRowStyle(cellStyle);
                for (int j = 0; j < columns; j++) {
                    Cell cell = row.createCell(j * 2);
                    cell.setCellStyle(cellStyle);
                    Random random = new Random();
                    cell.setCellValue(createHelper.createRichTextString(sounds[random.nextInt(sounds.length)]));
                }
            }
        }

        // Write the output to a file
        FileOutputStream out = new FileOutputStream("kana_poi.xlsx");
        wb.write(out);
        out.close();

    }

}
