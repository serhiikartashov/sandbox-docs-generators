package com.kartashov.aspose.examples;

import com.aspose.pdf.Document;
import com.aspose.pdf.ExcelSaveOptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertPDFtoExcel {

    // The path to the document directory.
    private static final Path _dataDir = Paths.get("source//pdfs//input.pdf");

    public static void main(String[] args) {

        ConvertPDFtoExcelSimple();
        ConvertPDFtoExcelAdvanced_InsertBlankColumnAtFirst();
        ConvertPDFtoExcelAdvanced_MinimizeTheNumberOfWorksheets();
        ConvertPDFtoExcelAdvanced_SaveXLSX();
    }

    public static void ConvertPDFtoExcelSimple() {
        // Load PDF document
        try (Document pdfDocument = new Document(_dataDir.toString())) {

            // Instantiate ExcelSave Option object
            ExcelSaveOptions excelsave = new ExcelSaveOptions();

            // Save the output in XLS format
            pdfDocument.save("output//xls//PDFToXLS_out1.xls", excelsave);
        }
    }

    public static void ConvertPDFtoExcelAdvanced_InsertBlankColumnAtFirst() {
        // Load PDF document
        try (Document pdfDocument = new Document(_dataDir.toString())) {
            // Instantiate ExcelSave Option object
            ExcelSaveOptions excelsave = new ExcelSaveOptions();
            excelsave.setInsertBlankColumnAtFirst(false);
            // Save the output in XLS format
            pdfDocument.save("output//xls//PDFToXLS_out2.xls", excelsave);
        }
    }

    public static void ConvertPDFtoExcelAdvanced_MinimizeTheNumberOfWorksheets() {
        // Load PDF document
        try (Document pdfDocument = new Document(_dataDir.toString())) {

            // Instantiate ExcelSave Option object
            ExcelSaveOptions excelsave = new ExcelSaveOptions();
            excelsave.setMinimizeTheNumberOfWorksheets(true);

            // Save the output in XLS format
            pdfDocument.save("output//xls//PDFToXLS_out3.xls", excelsave);
        }
    }

    public static void ConvertPDFtoExcelAdvanced_SaveXLSX() {
        // Load PDF document
        try (Document pdfDocument = new Document(_dataDir.toString())) {

            // Instantiate ExcelSave Option object
            ExcelSaveOptions excelSave = new ExcelSaveOptions();
            excelSave.setFormat(ExcelSaveOptions.ExcelFormat.XLSX);

            // Save the output in XLS format
            pdfDocument.save("output//xls//PDFToXLS_out4.xlsx", excelSave);
        }
    }
}
