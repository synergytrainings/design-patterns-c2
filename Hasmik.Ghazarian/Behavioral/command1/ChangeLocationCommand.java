package com.synisys.de.peru.command1;

/**
 * Author: Hasmik Ghazaryan on 2/4/2016.
 */
public class ChangeLocationCommand implements UndoableCommand {

    private Appointment appointment;
    private Location oldLocation;
    private Location newLocation;
    private LocationEditor editor;

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setLocationEditor(LocationEditor locationEditor) {
        editor = locationEditor;
    }

    public void execute() {

        oldLocation = appointment.getLocation();
        newLocation = editor.getNewLocation();
        appointment.setLocation(newLocation);
    }

    public void undo() {
        appointment.setLocation(oldLocation);
    }

    public void redo() {
        appointment.setLocation(newLocation);
    }
}
