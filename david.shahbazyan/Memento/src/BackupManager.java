import java.util.ArrayList;
import java.util.List;

/**
 * @author David.Shahbazyan
 * @since Mar 15, 2016
 */
public class BackupManager {
    private List<BackupItem> backupedItems = new ArrayList<>();
    private List<BackupItem> restoredItems = new ArrayList<>();

    public void saveBackup(BackupItem backupItem) {
        backupedItems.add(backupItem);
    }

    public BackupItem getBackup(Integer backupIndex) {
        return backupedItems.get(backupIndex);
    }

    public BackupItem getLastBackup() {
        return getBackup(backupedItems.size() - 1);
    }

    public BackupItem popLastBackup() {
        BackupItem backupItem = getLastBackup();
        backupedItems.remove(backupItem);
        restoredItems.add(backupItem);
        return backupItem;
    }
}
