package com.synisys.de.rwandaIngo.templateMethod;

public class CloseBugTask extends AbstractTask {
    private Issue issue;
    private String qaNotes;

    public CloseBugTask(Issue issue, String qaNotes) {
        this.issue = issue;
        this.qaNotes = qaNotes;
    }
    
    @Override
    protected void validateTask() {
        System.out.println("CloseBug: validate if qa notes exists");
        if (qaNotes == null) {
            throw new RuntimeException("Code review required");
        }
    }

    @Override
    protected void updateTaskState() {
        System.out.println("CloseBug: close the issue");
        issue.setQaNotes(qaNotes);
        TeamMember qa = issue.getQa();
        System.out.println("CloseBug: remove from qa " + qa.getName() + " roadmap");
        qa.removeFromRoadmap(issue);
        this.issue.setStatus(StatusEnum.CLOSED);
    }

    @Override
    protected void notifyInterestedParties() {
        System.out.println("CloseBug: notify interested parties");
        issue.getDev().notifyMember();
        issue.getQa().notifyMember();
        issue.notifyInterestedParties();   
    }
}
