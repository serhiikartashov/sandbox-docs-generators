package com.kartashov.aspose.examples;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class NewWorkbook {

    public static void main(String[] args) throws Exception {
        Workbook workbook = new Workbook(); // Creating a Workbook object
        workbook.save("newWorkBook.csv", SaveFormat.CSV); //Workbooks can be saved in many formats
        workbook.save("newWorkBook.pdf", SaveFormat.PDF); //Workbooks can be saved in many formats
    }
}
