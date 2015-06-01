package java.prototype.synisys.com;

/**
 * Created by Emil on 6/1/2015.
 */
public class User implements Copyable {
    private String firstName;
    private String lastName;
    private String[] phoneNumbers;
    private String address;

    public User() {
    }

    public User(String firstName, String lastName, String[] phoneNumbers, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(User user) {
        if (user != null) {
            this.firstName = user.getFirstName();
            this.lastName = user.getLastName();
            this.phoneNumbers = user.getPhoneNumbers().clone();
            this.address = user.getAddress();
        } else {
            throw new IllegalArgumentException("user can not be null");
        }
    }

    @Override
    public Copyable copy() {
        User user = new User();
        user.firstName = this.getFirstName();
        user.lastName = this.getLastName();
        user.phoneNumbers = this.getPhoneNumbers().clone();
        user.address = user.getAddress();
        return user;
    }
}
