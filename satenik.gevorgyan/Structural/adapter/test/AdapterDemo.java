package structral.adapter.test;

import structral.adapter.domain.CorelImpl;
import structral.adapter.domain.PhotoshopAdapter;
import structral.adapter.domain.Shape;

/**
 * Created by TikSat on 16.06.2015.
 */
public class AdapterDemo {

    public static void main(String[] args){
        CorelImpl corel = new CorelImpl(new Shape("FilledRectangle"),new Shape("SimpleLine"),new Shape("Special corel shape"));
        PhotoshopAdapter adapter = new PhotoshopAdapter(corel);
        adapter.getShapeList();
    }
}
