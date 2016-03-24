package behavioral.strategy;

/**
 * Created by Hasmik.Ghazaryan on 3/24/2016.
 */
public class StrategyDemo {

    public static void main(String[] args) {
        UseCard visaCard = new UseCard(150000, new VisaCardService());
        visaCard.withdraw();
        visaCard.buy();
        UseCard goldCard = new UseCard(150000, new GoldCardService());
        goldCard.withdraw();
        goldCard.buy();
        UseCard masterCard = new UseCard(150000, new MasterCardService());
        masterCard.withdraw();
        masterCard.buy();
    }
}
