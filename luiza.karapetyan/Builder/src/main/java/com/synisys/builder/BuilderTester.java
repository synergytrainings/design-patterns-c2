package example;

import java.math.BigDecimal;

/**
 * Created by Luiza.Karapetyan on 5/19/2015.
 */
public class BuilderTester {

    public static void main(String[] args) {
                BringMessage BuilderTest = new BuilderPattern()
                                .bringMessage(10)
                                .provider("VivaCell", "Belline", "Orange")
                                .duration(BigDecimal.valueOf(10))
                                .build();
        BuilderTest.printMessage();
            }
}
