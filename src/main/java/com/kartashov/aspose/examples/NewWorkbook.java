package com.kartashov.aspose.examples;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class NewWorkbook {

    public static void main(String[] args) throws Exception {
        Workbook workbook = new Workbook(); // Creating a Workbook object
        workbook.save("newWorkBook.xlsx", SaveFormat.XLSX); //Workbooks can be saved in many formats
    }
}
