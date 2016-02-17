package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/18/16 <br/>
 * <b>Time:</b> 2:20 AM <br/>
 */
public class ProductInfo {
    private String productName;
    private String manufacturerName;
    private int quantity;

    public ProductInfo(String productName, String manufacturerName, int quantity) {
        this.productName = productName;
        this.manufacturerName = manufacturerName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
