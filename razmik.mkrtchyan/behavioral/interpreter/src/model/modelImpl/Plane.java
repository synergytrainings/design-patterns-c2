package model.modelImpl;

import model.modelApi.Model;

/**
 *  * @author Razmik.Mkrtchyan
 *  * @since Feb 15, 2016.
 *  
 */
public class Plane extends Model {


    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void toLeft() {
        System.out.println("left");
    }

    @Override
    public void toRight() {
        System.out.println("right");
    }
}
