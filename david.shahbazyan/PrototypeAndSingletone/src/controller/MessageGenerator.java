package controller;

import domain.MessageRange;
import domain.Settings;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/2/15 <br/>
 * <b>Time:</b> 7:48 AM <br/>
 */
public class MessageGenerator {
    private Settings settings;

    public MessageGenerator(Settings settings) {
        this.settings = settings;
    }

    public void customize() throws CloneNotSupportedException {
        this.settings = this.settings.clone();
    }

    public Settings getSettings() {
        return settings;
    }
    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
