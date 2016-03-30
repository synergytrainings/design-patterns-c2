package com.synisys.de.rwandaIngo.templateMethod;

public class ResolveBugTask extends AbstractTask {
    private Issue issue;

    public ResolveBugTask(Issue issue) {
        this.issue = issue;
        this.issue.setStatus(StatusEnum.RESOLVED);
    }
    
    @Override
    protected void validateTask() {
        System.out.println("ResolveBug: validate if the code is reviewed");
        if (issue.getIsCodeReviewRqd() && issue.getIsCodeReviewDone()) {
            throw new RuntimeException("Code review required");
        }
    }

    @Override
    protected void updateTaskState() {
        System.out.println("ResolveBug: resolve issue");
        issue.getDev().removeFromRoadmap(issue);
        System.out.println("ResolveBug: issue resolved, removed from dev " + issue.getDev().getName() + " roadmap");
        TeamMember qa = issue.getQa();
        qa.addToRoadmap(issue);
        issue.setAssignedTo(qa);        
        System.out.println("ResolveBug: assigned to qa " + issue.getQa().getName());
    }

    @Override
    protected void notifyInterestedParties() {
        System.out.println("ResolveBug: notify interested parties");
        issue.getDev().notifyMember();
        issue.getQa().notifyMember();
        issue.notifyInterestedParties();   
    }
}
