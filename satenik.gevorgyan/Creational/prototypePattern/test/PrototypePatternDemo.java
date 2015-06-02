package prototypePattern.test;

import prototypePattern.Passport;

import java.io.IOException;
import java.util.Date;

/**
 * Created by TikSat on 02.06.2015.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws IOException {

        Passport passport = new Passport("Satenik Gevorgyan", "AG5221",new Date(),"Address", "PersonApplied", true);

        System.out.print("Passport full Information : \n" + passport.copyDetailed().toString());

        System.out.print("Passport minimal required Information : \n" + passport.copy().toString());


    }
    }
