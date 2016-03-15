/**
 * @author David.Shahbazyan
 * @since Mar 15, 2016
 */
public class UserData {
    private String name;
    private String surname;
    private Integer age;
    private String phone;
    private String email;

    public UserData() {
    }

    public BackupItem createBackup() {
        return new BackupItem(this);
    }

    public void restoreBackup(BackupItem backupItem) {
        this.name = backupItem.getUserData().getName();
        this.surname = backupItem.getUserData().getSurname();
        this.age = backupItem.getUserData().getAge();
        this.phone = backupItem.getUserData().getPhone();
        this.email = backupItem.getUserData().getEmail();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append('\n')
                .append("Surname: ").append(surname).append('\n')
                .append("Age: ").append(age).append('\n')
                .append("Phone: ").append(phone).append('\n')
                .append("Email: ").append(email);
        return sb.toString();
    }

    public static UserDataBuilder getBuilder() {
        return new UserDataBuilder();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static class UserDataBuilder {
        private final UserData data = new UserData();

        public UserData getData() {
            return data;
        }

        public UserDataBuilder setName(String name) {
            this.data.name = name;
            return this;
        }

        public UserDataBuilder setSurname(String surname) {
            this.data.surname = surname;
            return this;
        }

        public UserDataBuilder setAge(Integer age) {
            this.data.age = age;
            return this;
        }

        public UserDataBuilder setPhone(String phone) {
            this.data.phone = phone;
            return this;
        }

        public UserDataBuilder setEmail(String email) {
            this.data.email = email;
            return this;
        }
    }
}
