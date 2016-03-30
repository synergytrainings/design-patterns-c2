package com.synisys.de.rwandaIngo.templateMethod;

import java.util.HashMap;
import java.util.Map;

public class Project {
    

    public Issue createIssue(String string, String reportedBy, String module) {
        members.put(reportedBy, new TeamMember(reportedBy));
        moduleLeaders.put(module, new TeamMember(module));
        Issue issue = new Issue(this, "New Case", reportedBy, module);
        new NewBugTask(issue).execute();
        return issue;
    }

    public TeamMember findDeveloper(String dev) {
        return getMember(dev);
    }
    
    public TeamMember findQa(String qa) {
        return getMember(qa);
    }
    
    private TeamMember getMember(String memberName) {
        TeamMember tm = members.get(memberName);
        if (tm == null) {
            tm = new TeamMember(memberName);
            members.put(memberName, tm);
        }
        return tm;
    }

    public TeamMember findModuleLead(String moduleLead) {
        return getMember(moduleLead);
    }    

    public void notifyProjectLead() {
        System.out.println("notify project lead");
    }

    public void notifyQaLead() {
        System.out.println("notify qa lead");
    }
    
    public void notifyDevLead() {
        System.out.println("notify dev lead");
    }
    
    private Map<String, TeamMember> members = new HashMap<>();
    private Map<String, TeamMember> moduleLeaders = new HashMap<>();
}
