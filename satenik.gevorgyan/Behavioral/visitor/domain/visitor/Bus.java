package visitor.domain.visitor;


import visitor.domain.Dispatcher;

public class Bus implements Vehicle{
    public String vehicleNumber;
    public int maxSeatCount;
    public int orderSeatCount;
    public boolean haveConditioner;
    public int orderDays;
    public int pricePerDay;

    public Bus(String vehicleNumber, int maxSeatCount, boolean haveConditioner) {
        this.vehicleNumber = vehicleNumber;
        this.maxSeatCount = maxSeatCount;
        this.haveConditioner = haveConditioner;
    }

    @Override
    public void order(Dispatcher dispatcher) {
        dispatcher.order(this);
    }

    // ----- Getters and Setters --------------------------------------//


    public int getMaxSeatCount() {
        return maxSeatCount;
    }

    public int getOrderSeatCount() {
        return orderSeatCount;
    }

    public void setOrderSeatCount(int orderSeatCount) {
        this.orderSeatCount = orderSeatCount;
    }

    public boolean isHaveConditioner() {
        return haveConditioner;
    }

    public void setHaveConditioner(boolean haveConditioner) {
        this.haveConditioner = haveConditioner;
    }

    public int getOrderDays() {
        return orderDays;
    }

    public void setOrderDays(int orderDays) {
        this.orderDays = orderDays;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
