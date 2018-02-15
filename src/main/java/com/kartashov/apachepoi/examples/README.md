#Iterate over rows and cells

Sometimes, you'd like to just iterate over all the sheets in a workbook, all the rows in a sheet, or all the cells in a row. This is possible with a simple for loop.

These iterators are available by calling workbook.sheetIterator(), sheet.rowIterator(), and row.cellIterator(), or implicitly using a for-each loop. Note that a rowIterator and cellIterator iterate over rows or cells that have been created, skipping empty rows and cells.

    for (Sheet sheet : wb ) {
        for (Row row : sheet) {
            for (Cell cell : row) {
                // Do something here
            }
        }
    }

ssss