package chainOofResponsibility;


public class AnalogTest extends AbstractTest{

    public AnalogTest(int level) {
        this.testLevel = level;
    }

    @Override
    protected void testLog(String message) {
        System.out.println("AnalogTest Logger: " + message);
    }
}
