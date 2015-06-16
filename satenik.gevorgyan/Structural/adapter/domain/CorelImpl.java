package structral.adapter.domain;

/**
 * Created by TikSat on 16.06.2015.
 */
public class CorelImpl implements Corel {
    private Shape rectangle;
    private Shape line;
    private Shape specificObject;

    public CorelImpl(Shape rectangle, Shape line, Shape specificObject) {
        this.rectangle = rectangle;
        this.line = line;
        this.specificObject = specificObject;
    }

    @Override
    public void drawCorelRectangle() {
        System.out.print("Draw rectangle" + rectangle.getName()+ "\n");
    }

    @Override
    public void drawCorelLine() {
        System.out.print("Draw line" + line.getName() + "\n");
    }

    @Override
    public void drawCorelSpecificObject() {
        System.out.print("Draw Corel specific object" + specificObject.getName() + "\n");
    }

    public void availableFunctionality(){
        System.out.print("Can draw following Corel shapes: " + "\n" + rectangle.getName() + "\n" + line.getName()+ "\n" + specificObject.getName() + "\n");

    }
}
