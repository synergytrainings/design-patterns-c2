package visitor.domain.visitor;


import visitor.domain.Dispatcher;

public class Ship implements Vehicle{
    public int serialNumber;
    public String situationPlace;
    public int pricePerDay = 1500;

    public Ship(int serialNumber, String situationPlace) {
        this.serialNumber = serialNumber;
        this.situationPlace = situationPlace;
    }

    @Override
    public void order(Dispatcher dispatcher) {
        dispatcher.order(this);
    }

    // ----- Getters and Setters --------------------------------------//
    public String getSituationPlace() {
        return situationPlace;
    }

    public void setSituationPlace(String situationPlace) {
        this.situationPlace = situationPlace;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
