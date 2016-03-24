package behavioral.strategy;

/**
 * Created by Hasmik.Ghazaryan on 3/24/2016.
 */
public class GoldCardService implements CardService {

    @Override
    public void cashBack(Integer amount) {
        // 10% cashBack
    }

    @Override
    public void charge(Integer amount) {
        // 2% charge fee
    }

    @Override
    public void discount() {
        // 15% discount
    }
}
