package command.domain.food;


public class Salad implements Food {
    @Override
    public Integer getAmount() {
        return 500;
    }

    @Override
    public String getName() {
        return "Greece";
    }

    @Override
    public Boolean isAvailable() {
        return null;
    }

    @Override
    public void setAvailableSatus(Boolean status) {

    }
}
