import java.util.Date;

/**
 * @author David.Shahbazyan
 * @since Mar 15, 2016
 */
public class BackupItem {
    private final Date modificationDate = new Date();
    private final UserData userData;

    public BackupItem(UserData userData) {
        this.userData = userData;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public UserData getUserData() {
        return userData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Last modified: ").append(modificationDate).append('\n')
                .append("--------------------------").append('\n')
                .append(userData.toString()).append('\n')
                .append("--------------------------");
        return sb.toString();
    }
}
