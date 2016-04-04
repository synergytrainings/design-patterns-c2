package com.synisys.training.patterns.behavioral.template;

import java.io.File;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public class ExcelExporter extends ReportExporter {

    @Override
    public void createFile() {
        file = new File("export" + EXCEL_FILE_EXT);
    }

    @Override
    public void exportDataTFile() {
        System.out.println("Exports Data into excel file");
    }

}
