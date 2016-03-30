package com.synisys.de.rwandaIngo.templateMethod;

/**
 * Created by Luiza.Karapetyan on 3/30/2016.
 */
public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        Issue issue = project.createIssue("Example of template pattern", "Tom", "ModuleA");
        issue.assignTo("Ram");
        issue.resolve();
        issue.close("Qa done");
    }
    }
