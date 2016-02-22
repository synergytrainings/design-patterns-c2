package chainOofResponsibility;


public class DigitTest extends AbstractTest{

    public DigitTest(int level) {
        this.testLevel = level;
    }

    @Override
    protected void testLog(String message) {
        System.out.println("DigitTest Logger: " + message);
    }
}
