package hasie.main;

/**
 * Author: Hasmik Ghazaryan on 6/5/2015.
 */
public class User {

    private String userId;
    private String userName;
    private String gender;
    private String location;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String geneder) {
        this.gender = geneder;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
