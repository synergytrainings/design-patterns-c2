package behavioral.strategy;

/**
 * Created by Hasmik.Ghazaryan on 3/24/2016.
 */
public class VisaCardService implements CardService {

    @Override
    public void cashBack(Integer amount) {
        // No CashBack service
    }

    @Override
    public void charge(Integer amount) {
        // No charge fee
    }

    @Override
    public void discount() {
        // 5% discount
    }
}
