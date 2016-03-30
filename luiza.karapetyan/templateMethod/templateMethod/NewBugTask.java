package com.synisys.de.rwandaIngo.templateMethod;

public class NewBugTask extends AbstractTask {
    private Issue issue;
    
    public NewBugTask(Issue issue) {
        this.issue = issue;        
    }

    @Override
    protected void validateTask() {
        System.out.println("NewBug: validate if a module leader exists for module " + issue.getModuleLeader().getName());
        TeamMember moduleLeader = issue.getModuleLeader();
        if (moduleLeader == null) {
            throw new RuntimeException("No moduler leader assigned for module <");
        }
    }

    @Override
    protected void updateTaskState() {
        System.out.println("NewBug: Create new issue and assign to module leader " + issue.getModuleLeader().getName());
        this.issue.setStatus(StatusEnum.NEW);
        TeamMember moduleLeader = issue.getModuleLeader();
        moduleLeader.addToRoadmap(issue);
        issue.setAssignedTo(moduleLeader);
    }

    @Override
    protected void notifyInterestedParties() {
        System.out.println("NewBug: notify interested parties");
        issue.getAssignedTo().notifyMember();
        issue.getProject().notifyProjectLead();
        issue.getReportedBy().notifyMember();
        issue.getProject().notifyQaLead();
    }

}
