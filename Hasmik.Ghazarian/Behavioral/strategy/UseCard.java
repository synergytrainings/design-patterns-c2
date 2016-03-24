package behavioral.strategy;

/**
 * Created by Hasmik.Ghazaryan on 3/24/2016.
 */
public class UseCard {

    private final CardService cardService;
    private final Integer amount;

    public UseCard(Integer amount, CardService cardService) {
        this.amount = amount;
        this.cardService = cardService;
    }

    public void buy() {
        cardService.discount();
        cardService.cashBack(amount);
    }

    public void withdraw() {
        cardService.charge(amount);
    }
}
