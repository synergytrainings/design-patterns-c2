package com.synisys.de.rwandaIngo.templateMethod;

import java.util.ArrayList;
import java.util.List;

public class TeamMember {
    private String name;
    private List<Issue> issues = new ArrayList<Issue>();

    TeamMember(String name) {
        this.name = name;
    }

    public void addToRoadmap(Issue issue) {
        issues.add(issue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeFromRoadmap(Issue issue) {
        issues.remove(issue);        
    }

    public void notifyMember() {
        System.out.println("notify " + name);
    }       
}
