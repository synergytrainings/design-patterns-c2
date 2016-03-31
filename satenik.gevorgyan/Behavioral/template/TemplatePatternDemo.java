package template;


import template.domain.CustomReport;
import template.domain.ReportTemplate;
import template.domain.StandardReport;

public class TemplatePatternDemo {

    public static void main(String[] args) {

        ReportTemplate standard = new StandardReport("Adam Smith", 2);
        standard.generateReport();

        ReportTemplate custom = new CustomReport("John Adams", 15);
        standard.generateReport();



    }
}
