package com.synisys.de.rwandaIngo.templateMethod;

public class AssignBugTask extends AbstractTask {
    private Issue issue;
    private String assignTo;
    public AssignBugTask(Issue issue, String assignTo) {
        this.issue = issue;    
        this.assignTo = assignTo;
    }

    @Override
    protected void validateTask() {  
        System.out.println("AssignBug: validate whether dev " + assignTo + " exists");
        if (issue.getProject().findDeveloper(assignTo) == null) {
            throw new RuntimeException("No developer found");
        }
    }

    @Override
    protected void updateTaskState() {
        System.out.println("AssignBug: assign the bug to " + assignTo);
        this.issue.setStatus(StatusEnum.ASSIGNED);
        TeamMember dev = issue.getProject().findDeveloper(assignTo);
        issue.assignTo(dev);  
        issue.setDev(dev);
    }

    @Override
    protected void notifyInterestedParties() {
        System.out.println("AssignBug: notify interested parties");
        issue.getDev().notifyMember();
        issue.getQa().notifyMember();
        issue.notifyInterestedParties();        
    }
}
