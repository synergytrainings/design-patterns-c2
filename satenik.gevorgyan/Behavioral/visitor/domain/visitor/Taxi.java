package visitor.domain.visitor;


import visitor.domain.Dispatcher;

public class Taxi implements Vehicle{
    public int pricePerKM;
    public boolean available = true;
    public String vehicleNumber;
    public int orderKm;

    public Taxi(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public void order(Dispatcher dispatcher) {
        dispatcher.order(this);
    }

    // ----- Getters and Setters --------------------------------------//


    public int getPricePerKM() {
        return pricePerKM;
    }

    public void setPricePerKM(int pricePerKM) {
        this.pricePerKM = pricePerKM;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getOrderKm() {
        return orderKm;
    }

    public void setOrderKm(int orderKm) {
        this.orderKm = orderKm;
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
