package chainOofResponsibility;


public abstract class AbstractTest {

    protected AbstractTest next;
    protected int testLevel;

    public void setNext(AbstractTest next){
        this.next = next;
    }

    protected void test(int level, String message){
        if(this.testLevel <= level){
            testLog(message);
        }
        if(next !=null){
            next.test(level, message);
        }
    }

    abstract protected void testLog(String message);

}
