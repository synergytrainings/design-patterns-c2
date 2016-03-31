package template.domain;


public class StandardReport extends ReportTemplate{

    public StandardReport(String reporterName, int permission) {
        super(reporterName, permission);
    }



    @Override
    public void connectToDataSource() {
        System.out.println("Connect to standard directory");

    }

    @Override
    public ReportData pullDataFromDataSource() {
        ReportData data= new ReportData();
        if(getPermission() > 2) {
            System.out.println("In standard report data read from XML and get all data");
        }
        return data;
    }

    @Override
    public void saveReport(Report report) {
        System.out.println("Save report to standard directory");

    }

    @Override
    public void displayReport(Report report) {
        System.out.println("Display Report with browser");

    }

    @Override
    public ReportData collectData(ReportData data) {
        System.out.println("Manage data for Standard Report");
        return data;
    }

    @Override
    public String getReportDate() {
        System.out.println("Manage data for Standard Report");

        return "Standard 20:00 PM";
    }

    @Override
    public String getReportReason() {
        return "Standard text  + Standard report Reason";
    }
}
