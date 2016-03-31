package template.domain;


import java.util.Calendar;

public class CustomReport extends ReportTemplate {

    public CustomReport(String reporterName, int permission) {
        super(reporterName, permission);
    }

    public String getCustomDirectory(){
        String directory = new String();
    System.out.println("By permission get custom report directory");
        return directory;
}

    @Override
    public void connectToDataSource() {
        getCustomDirectory();
        System.out.println("Connect to Custom directory");

    }

    @Override
    public ReportData pullDataFromDataSource() {
        ReportData data= new ReportData();

       System.out.println("Load data depending on reporter permissions");

        return data;
    }

    @Override
    public void saveReport(Report report) {
        getCustomDirectory();
        System.out.println("Save report to custom directory");

    }

    @Override
    public void displayReport(Report report) {
        System.out.println("Display Report with Excel.");

    }

    @Override
    public ReportData collectData(ReportData data) {
        System.out.println("Manage data for Custom Report");
        return data;
    }

    @Override
    public String getReportDate() {
        System.out.println("Manage data for Custom Report");

        return String.valueOf(Calendar.getInstance().toString());
    }

    @Override
    public String getReportReason() {
        return "Custom report Reason";
    }
}
