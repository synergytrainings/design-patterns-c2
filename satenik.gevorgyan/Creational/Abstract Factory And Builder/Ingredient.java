/**
 * Created by TikSat on 15.05.2015.
 */
public class Ingredient {
    protected Double price;// for one kg
    protected Double quantity; // by grams

    public Double calculatePriceByQuantity(){
        Double result;
        return result = (quantity * price)/1000;
    }

    public Ingredient(Builder builder){
        this.price = builder.price;
        this.quantity = builder.quantity;
    }

    public static class Builder {
        protected Double price;
        protected Double quantity;

        public Builder price(Double dram){this.price = dram; return this; }
        public Builder quantity(Double gram){this.quantity = gram; return this; }

        public Ingredient build(){
            return new Ingredient(this);
        }
    }

    }

