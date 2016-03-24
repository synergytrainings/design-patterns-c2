package behavioral.strategy;

/**
 * Created by Hasmik.Ghazaryan on 3/24/2016.
 */
public class MasterCardService implements CardService {

    @Override
    public void cashBack(Integer amount) {
        // 5% cashBack
    }

    @Override
    public void charge(Integer amount) {
        // 1% charge fee
    }

    @Override
    public void discount() {
        // 10% discount
    }
}
