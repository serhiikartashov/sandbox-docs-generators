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

1. New Workbook - Example1 (https://poi.apache.org/spreadsheet/quick-guide.html#New+Workbook)
2. New Sheet - Example2 (https://poi.apache.org/spreadsheet/quick-guide.html#New+Sheet)
3. Creating Cell - Example3 (https://poi.apache.org/spreadsheet/quick-guide.html#Creating+Cells)
4. Creating Date Cell - (https://poi.apache.org/spreadsheet/quick-guide.html#Creating+Date+Cells)
5. Working with different types of cells - (https://poi.apache.org/spreadsheet/quick-guide.html#Working+with+different+types+of+cells)
6. Files vs InputStreams - (https://poi.apache.org/spreadsheet/quick-guide.html#Files+vs+InputStreams)
7. Demonstrates various alignment options - Example7 (https://poi.apache.org/spreadsheet/quick-guide.html#Demonstrates+various+alignment+options)
8. Working with borders - Example8 (https://poi.apache.org/spreadsheet/quick-guide.html#Working+with+borders)
9. Iterate over rows and cells - (https://poi.apache.org/spreadsheet/quick-guide.html#Iterate+over+rows+and+cells)
10. Iterate over cells, with control of missing / blank cells - (https://poi.apache.org/spreadsheet/quick-guide.html#Iterate+over+cells%2C+with+control+of+missing+%2F+blank+cells)
11. Getting the cell contents - (https://poi.apache.org/spreadsheet/quick-guide.html#Getting+the+cell+contents)
12. Text Extraction - (https://poi.apache.org/spreadsheet/quick-guide.html#Text+Extraction)
13. Fills and colors - (https://poi.apache.org/spreadsheet/quick-guide.html#Fills+and+colors)
14. Merging cells - Example14 (https://poi.apache.org/spreadsheet/quick-guide.html#Merging+cells)
15. Working with fonts - (https://poi.apache.org/spreadsheet/quick-guide.html#Working+with+fonts)
16. Reading and Rewriting Workbooks - (https://poi.apache.org/spreadsheet/quick-guide.html#Reading+and+Rewriting+Workbooks)
17. Using newlines in cells - (https://poi.apache.org/spreadsheet/quick-guide.html#Using+newlines+in+cells)
18. Data Formats - (https://poi.apache.org/spreadsheet/quick-guide.html#Data+Formats)
19. Fit Sheet to One Page - Example19 (https://poi.apache.org/spreadsheet/quick-guide.html#Fit+Sheet+to+One+Page)
20. Set Print Area - Example20 (https://poi.apache.org/spreadsheet/quick-guide.html#Set+Print+Area) 
21. Set Page Numbers on Footer - (https://poi.apache.org/spreadsheet/quick-guide.html#Set+Page+Numbers+on+Footer)
22. Using the Convenience Functions - (https://poi.apache.org/spreadsheet/quick-guide.html#Using+the+Convenience+Functions) 
23. Shift rows up or down on a sheet - (https://poi.apache.org/spreadsheet/quick-guide.html#Shift+rows+up+or+down+on+a+sheet)
24. Set a sheet as selected - (https://poi.apache.org/spreadsheet/quick-guide.html#Set+a+sheet+as+selected)
25. Set the zoom magnification - (https://poi.apache.org/spreadsheet/quick-guide.html#Set+the+zoom+magnification)
26. Splits and freeze panes - Example26 (https://poi.apache.org/spreadsheet/quick-guide.html#Splits+and+freeze+panes)
