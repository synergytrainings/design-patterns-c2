/**
 * @author David.Shahbazyan
 * @since Mar 15, 2016
 */
public class Main {
    public static void main(String[] args) {
        BackupManager backupManager = new BackupManager();

        System.out.println("/* New instance > Saved as backup[1] */");
        UserData data = UserData.getBuilder()
                .setName("User1 name")
                .setSurname("User1 surname")
                .setAge(15)
                .setPhone("352-892-2482")
                .setEmail("testMail@localhost.loc")
                .getData();
        backupManager.saveBackup(data.createBackup());
        System.out.println(backupManager.getBackup(0));

        System.out.println("/* Change 1 > Saved as backup[2] */");
        data.setPhone("555-654-3214");
        data.setEmail("blah@mail.ru");
        backupManager.saveBackup(data.createBackup());
        System.out.println(backupManager.getBackup(1));

        System.out.println("/* New clear instance */");
        data = new UserData();
        System.out.println(data);
        System.out.println("------------------------------");

        System.out.println("/* Data restored from last change (backup[2]) */");
        data.restoreBackup(backupManager.getLastBackup());
        System.out.println(data);
        System.out.println("------------------------------");
    }
}
