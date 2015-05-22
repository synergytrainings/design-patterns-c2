import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TikSat on 19.05.2015.
 */
public class DesigPatternExample {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please choose one of the salads //Yerevan//Greece :");
        String saladName = br.readLine();
        System.out.print("\n");

        AbstractMealFactory saladFactory = FactoryProducer.getFactory();
        Salad salad = saladFactory.getSalad(saladName);

        System.out.print("Your salad price is : " + salad.getPrice() + " Dram");
        System.out.print("\n");


    }
}
