package com.synisys.training.patterns.behavioral.template;

import java.io.File;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public abstract class ReportExporter {
    public static String EXCEL_FILE_EXT = ".xls";
    public static String HTML_FILE_EXT = ".htm";

    protected File file;


    public void exportReport() {
        generateQuery();
        loadData();
        createFile();
        exportDataTFile();
    }

    public abstract void createFile();
    public abstract void exportDataTFile();

    private void loadData() {
        System.out.println("Executes query and collects data to export");

    }

    private void generateQuery() {
        System.out.println("Generates query");

    }
}
