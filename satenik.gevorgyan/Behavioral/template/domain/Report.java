package template.domain;


import java.util.ArrayList;

public class Report {

    private String  reporter;
    private String  reportDate;
    private String  reason;
    private ArrayList<String> organisations;

    public Report(String reporter, String reportDate, String reason) {
        this.reporter = reporter;
        this.reportDate = reportDate;
        this.reason = reason;
    }


    // ----- Getters and Setter -----------------------------//


    public String getReporter() {
        return reporter;
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getReason() {
        return reason;
    }

    public ArrayList<String> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(ArrayList<String> organisations) {
        this.organisations = organisations;
    }

    public String toString(){
        return "Report: " +" "+ reporter +" "+ reportDate +" "+ reason + "Organisation Info ";
    }
}