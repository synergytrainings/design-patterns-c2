package facade.domain;

import java.util.Date;


public interface Shop {
    void order(Food ... foods);
    void makeFood();
    String shopName();
}
