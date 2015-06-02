package prototypePattern;

import java.util.Date;

/**
 * Created by TikSat on 02.06.2015.
 */
public class Passport implements Copyable{
    private String ownerName;
    private String passportNumber;
    private Date whenApplied;
    private String address;
    private String whoApplied;
    private boolean marred;

    public Passport(String ownerName,String passportNumber, Date whenApplied, String address, String whoApplied, boolean marred) {
        this.ownerName = ownerName;
        this.passportNumber = passportNumber;
        this.whenApplied = whenApplied;
        this.address = address;
        this.whoApplied = whoApplied;
        this.marred = marred;
    }

    public Passport(String ownerName,String passportNumber, Date whenApplied, String whoApplied) {
        this.ownerName = ownerName;
        this.passportNumber = passportNumber;
        this.whenApplied = whenApplied;
        this.whoApplied = whoApplied;
    }

    @Override
    public Object copy() {
        return new Passport(ownerName,passportNumber,whenApplied,whoApplied);
    }

    @Override
    public Object copyDetailed() {
        return new Passport(ownerName,passportNumber,whenApplied,address,whoApplied,marred);
    }

    public String toString(){
        StringBuilder passportInfo = new StringBuilder();
        passportInfo.append("Owner:"   + ownerName + "\n");
        passportInfo.append("PassportNumber " + passportNumber + "\n");
        passportInfo.append("Applied date " +whenApplied + "\n");
        passportInfo.append("Applied person " +whoApplied + "\n");
        return passportInfo.toString();

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getWhenApplied() {
        return whenApplied;
    }

    public void setWhenApplied(Date whenApplied) {
        this.whenApplied = whenApplied;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWhoApplied() {
        return whoApplied;
    }

    public void setWhoApplied(String whoApplied) {
        this.whoApplied = whoApplied;
    }

    public boolean isMarred() {
        return marred;
    }

    public void setMarred(boolean marred) {
        this.marred = marred;
    }
}
