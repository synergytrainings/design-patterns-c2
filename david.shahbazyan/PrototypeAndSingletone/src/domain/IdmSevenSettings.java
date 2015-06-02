package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/2/15 <br/>
 * <b>Time:</b> 7:54 AM <br/>
 */
public class IdmSevenSettings extends Settings {
    private static IdmSevenSettings INSTANCE;

    static {
        try {
            INSTANCE = new IdmSevenSettings();
        } catch (Exception ex) {
            throw new RuntimeException("Already instantiated!", ex);
        }
    }

    private IdmSevenSettings() {
    }

    @Override
    void initRange() {
        settingsName = this.getClass().getSimpleName();
        range = new MessageRange(200000, 300000);
    }

    @Override
    public IdmSevenSettings clone() throws CloneNotSupportedException {
        return (IdmSevenSettings) super.clone();
    }

    public static IdmSevenSettings getInstance() {
        return INSTANCE;
    }
}
