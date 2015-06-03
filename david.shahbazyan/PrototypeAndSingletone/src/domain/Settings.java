package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/2/15 <br/>
 * <b>Time:</b> 7:51 AM <br/>
 */
public abstract class Settings implements Cloneable {
    protected String settingsName;
    protected MessageRange range;

    public Settings() {
        initRange();
    }

    abstract void initRange();

    @Override
    public Settings clone() throws CloneNotSupportedException {
        Settings settings = (Settings) super.clone();
        settings.setRange(this.range);
        return settings;
    }

    public String getSettingsName() {
        return settingsName;
    }

    public MessageRange getRange() {
        return range;
    }
    public void setRange(MessageRange range) {
        this.range = range;
    }
}
