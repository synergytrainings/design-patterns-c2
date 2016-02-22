package command.domain.food;


public interface Food {
    public Integer getAmount();
    public String getName();
    public Boolean isAvailable();
    public void setAvailableSatus(Boolean status);
}
