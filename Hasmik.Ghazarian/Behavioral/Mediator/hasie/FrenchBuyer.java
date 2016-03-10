package hasie;

/**
 * Created by Hasmik.Ghazaryan on 3/3/2016.
 */
public class FrenchBuyer extends Buyer {

    public FrenchBuyer(Mediator mediator) {
        super(mediator, "euro");
        this.mediator.registerFrenchBuyer(this);
    }
}
