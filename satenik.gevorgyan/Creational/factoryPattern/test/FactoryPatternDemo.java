package factoryPattern.test;

import factoryPattern.domain.Shoes;
import factoryPattern.domain.ShoesImpl;
import factoryPattern.factory.Factory;
import factoryPattern.factory.MenShoesFactory;
import factoryPattern.factory.ShoesFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TikSat on 22.05.2015.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please write shoesCategory // MEN // WOMEN :");
        String category = br.readLine();
        System.out.print("\n");

        ShoesFactory factory = ShoesFactory.produceShoesFactory(category);

        System.out.print("Please specify shoes Brand : ");
        String brand = br.readLine();
        System.out.print("\n");


        System.out.print("Please specify shoes Season type// season : ");
        String seasonType = br.readLine();
        System.out.print("\n");

        System.out.print("Please specify shoes Size : ");
        String size = br.readLine();
        System.out.print("\n");

        System.out.print("Please specify shoes Color : ");
        String color = br.readLine();
        System.out.print("\n");

        Shoes shoes = factory.makeShoes(brand,seasonType,Integer.valueOf(size),color);

        System.out.print("Please View new made shoes details: ");
        System.out.print(shoes.shoesDetails());
    }
}
