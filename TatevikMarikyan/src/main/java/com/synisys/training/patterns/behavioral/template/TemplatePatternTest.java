package com.synisys.training.patterns.behavioral.template;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * @author Tatevik.Marikyan
 * @since 04-Apr-16.
 */
public class TemplatePatternTest {

    @Test
    public void testTemplatePattern() {

        ReportExporter exporter = new ExcelExporter();
        exporter.exportReport();
        Assert.assertTrue(exporter.file.getName().contains(ReportExporter.EXCEL_FILE_EXT));


        exporter = new HtmlExporter();
        exporter.exportReport();
        Assert.assertTrue(exporter.file.getName().contains(ReportExporter.HTML_FILE_EXT));


    }

}
