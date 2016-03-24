package behavioral.strategy;

/**
 * Created by Hasmik.Ghazaryan on 3/24/2016.
 */
public interface CardService {

    void cashBack(Integer amount);
    void charge(Integer amount);
    void discount();
}
