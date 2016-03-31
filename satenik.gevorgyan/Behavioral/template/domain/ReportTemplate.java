package template.domain;


import java.util.ArrayList;

public abstract class ReportTemplate {
    private String reporterName;
    private int permission;

    protected ReportTemplate(String reporterName, int permission) {
        this.reporterName = reporterName;
        this.permission = permission;
    }

    public final void generateReport(){
        connectToDataSource();
        ReportData data = pullDataFromDataSource();
        data = collectData(data);
        Report report = createReport(data,getReportReason(),getReportDate());
        saveReport(report);
        displayReport(report);

    }

    public Report createReport(ReportData data, String reason, String date){
        Report report = new Report(this.reporterName,date,reason);
        ArrayList<String> filteredOrgs;
        if(this.permission > 5){
            report.setOrganisations(data.getOrganisations());
        }else {
            filteredOrgs = new ArrayList<>();
            for (int i = 0; i < data.getOrganisations().size(); i++) {
                String org = data.getOrganisations().get(i);
                if(org.contains("Government")){
                    filteredOrgs.add(org);
                }
            }
        }
        report.toString();
        return report;
    }



    public abstract void connectToDataSource();

    public abstract ReportData pullDataFromDataSource();

    public abstract void saveReport(Report report);

    public abstract void displayReport(Report report);

    public abstract ReportData collectData(ReportData data);

    public abstract String getReportDate();

    public abstract String getReportReason();

    public int getPermission() {
        return permission;
    }

    public String getReporterName() {
        return reporterName;
    }
}
