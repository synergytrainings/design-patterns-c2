package factoryPattern.factory;

import factoryPattern.domain.Shoes;

/**
 * Created by TikSat on 22.05.2015.
 */
public  abstract class ShoesFactory implements Factory{

  public static ShoesFactory produceShoesFactory(String shoesCategory){
      switch (shoesCategory){
          case "WOMEN":
              return new WomenShoesFactory();
          case "MEN":
              return new MenShoesFactory();
      }
      return null;
  }

    public enum ShoesTypes{
        WOMEN,
        MEN,
        CHILDREN
    }
}
