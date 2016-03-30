package com.synisys.de.rwandaIngo.templateMethod;

public class ReopenBugTask extends AbstractTask {
    private Issue issue;
    private String reason;
    
    public ReopenBugTask(Issue issue, String reason) {
        this.issue = issue;
    }

    @Override
    protected void validateTask() {  
        System.out.println("ReopenBug: validate if reason exists");
        if (reason == null) {
            throw new RuntimeException("No reason found");
        }
    }

    @Override
    protected void updateTaskState() {
        System.out.println("ReopenBug: re-assign to " + issue.getDeveloper().getName());
        this.issue.setStatus(StatusEnum.REOPENED);
        this.issue.setAssignedTo(issue.getDeveloper());
        issue.getDeveloper().addToRoadmap(issue);        
    }

    @Override
    protected void notifyInterestedParties() {
        System.out.println("ReopenBug: notify interested parties");
        issue.getDeveloper().notifyMember();
        issue.getQa().notifyMember();
        issue.notifyInterestedParties();        
    }
}