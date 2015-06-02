package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/2/15 <br/>
 * <b>Time:</b> 7:53 AM <br/>
 */
public class IdmSixSettings extends Settings {
    private static IdmSixSettings INSTANCE;

    static {
        try {
            INSTANCE = new IdmSixSettings();
        } catch (Exception ex) {
            throw new RuntimeException("Already instantiated!", ex);
        }
    }

    private IdmSixSettings() {
    }

    @Override
    void initRange() {
        settingsName = this.getClass().getSimpleName();
        range = new MessageRange(4000, 5999);
    }

    @Override
    public IdmSixSettings clone() throws CloneNotSupportedException {
        return (IdmSixSettings) super.clone();
    }

    public static IdmSixSettings getInstance() {
        return INSTANCE;
    }
}
