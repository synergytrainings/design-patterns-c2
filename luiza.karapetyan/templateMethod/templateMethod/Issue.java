package com.synisys.de.rwandaIngo.templateMethod;

public class Issue {
    private StatusEnum status;
    private TeamMember assignedTo;
    private TeamMember reportedBy;
    private TeamMember dev;
    private TeamMember qa;
    private TeamMember moduleLead;
    private Project project;
    private String bugDesc;
    private boolean codeReview;
    private boolean codeReviewDone;
    private String qaNotes;
    private int estimation;

    public Issue(Project project, String bugDesc, String reportedBy, String module) {
        this.project = project;
        this.bugDesc = bugDesc;
        this.reportedBy = project.findQa(reportedBy);
        moduleLead = project.findModuleLead(module);
        this.qa = this.reportedBy;
    }

    public void resolve() {
        new ResolveBugTask(this).execute();
    }
    
    public void assignTo(String assigneeName) {
        new AssignBugTask(this, assigneeName).execute();
    }

    public void close(String qaNotes) {        
        new CloseBugTask(this, qaNotes).execute();
    }
    
    public void reopen(String reason) {        
        new ReopenBugTask(this, reason).execute();
    }
    
    public TeamMember getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(TeamMember reportedBy) {
        this.reportedBy = reportedBy;
    }

    public TeamMember getDev() {
        return dev;
    }

    public void setDev(TeamMember dev) {
        this.dev = dev;
    }

    public TeamMember getQa() {
        return qa;
    }

    public void setQa(TeamMember qa) {
        this.qa = qa;
    }

    public String getBugDesc() {
        return bugDesc;
    }

    public void setBugDesc(String bugDesc) {
        this.bugDesc = bugDesc;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public TeamMember getAssignedTo() {
        return assignedTo;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getEstimation() {
        return estimation;
    }
    
    public boolean isCodeReview() {
        return codeReview;
    }

    public void setCodeReview(boolean codeReview) {
        this.codeReview = codeReview;
    }

    public boolean isCodeReviewDone() {
        return codeReviewDone;
    }

    public void setCodeReviewDone(boolean codeReviewDone) {
        this.codeReviewDone = codeReviewDone;
    }

    public String getQaNotes() {
        return qaNotes;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    public void setStatus(StatusEnum status) {
       this.status = status;
    }

    public void notifyInterestedParties() {
        System.out.println("notify others");
    }

    public TeamMember getAssignee() {
        return assignedTo;
    }

    public boolean getIsCodeReviewRqd() {
        return codeReview;
    }

    public boolean getIsCodeReviewDone() {
        return codeReviewDone;
    }

    public void assignTo(TeamMember member) {
        member.addToRoadmap(this);
        assignedTo = member;
    }

    public TeamMember getDeveloper() {
        return dev;
    }

    public void setAssignedTo(TeamMember assignedTo) {
        this.assignedTo = assignedTo;       
    }

    public TeamMember getModuleLeader() {
        return moduleLead;
    }

    public void setQaNotes(String qaNotes) {
        this.qaNotes = qaNotes;        
    }

}
