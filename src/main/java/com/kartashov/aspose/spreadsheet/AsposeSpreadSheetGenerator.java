package com.kartashov.aspose.spreadsheet;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.kartashov.Util;

public class AsposeSpreadSheetGenerator {

    public static void main(String[] args) throws Exception {
        String[] list = Util.sounds;

        Workbook workbook = new Workbook();
        workbook.save("kana_aspose.xlsx", SaveFormat.XLSX);
    }
}
