package chainOofResponsibility;

public class ChainPatternDemo {

    public static void main(String[] args) {
        AbstractTest analogTest = new AnalogTest(1);
        AbstractTest digitTest = new DigitTest(2);
        analogTest.setNext(digitTest);

        AbstractTest test = analogTest;

        //ligth test level 1
        test.test(1, "ligth test.");

        //detailed test level 2
        test.test(2, "Detailed test .");


    }
}
