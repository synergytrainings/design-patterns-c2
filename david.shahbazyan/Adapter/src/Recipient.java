/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/5/15 <br/>
 * <b>Time:</b> 3:57 AM <br/>
 */
public class Recipient {
    private String name;
    private String email;
    /**
     * 1 - Male
     * 2 - Female
     */
    private Integer gender;

    public Recipient() {}

    public Recipient(String name, String email, Integer gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
