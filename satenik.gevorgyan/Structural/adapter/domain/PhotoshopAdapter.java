package structral.adapter.domain;


public class PhotoshopAdapter implements Photoshop{
    private CorelImpl corel;

    public PhotoshopAdapter(CorelImpl corel) {
        this.corel = corel;
    }

    @Override
    public void drawRectangle() {
        corel.drawCorelRectangle();
    }

    @Override
    public void drawlLine() {
        corel.drawCorelLine();
    }

    @Override
    public void drawOtherObject() {
        corel.drawCorelSpecificObject();
    }

    public void getShapeList(){
        corel.availableFunctionality();
    }
}
