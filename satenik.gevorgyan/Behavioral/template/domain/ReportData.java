package template.domain;


import java.util.ArrayList;

public class ReportData {

    private ArrayList<String> organisations;

    public ReportData() {
        organisations = new ArrayList<>();
    }

    public ArrayList<String> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(ArrayList<String> organisations) {
        this.organisations = organisations;
    }
}
