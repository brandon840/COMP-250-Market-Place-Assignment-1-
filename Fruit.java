package assignment1;

public class Fruit extends MarketProduct{
    private double weightFruit;
    private int pricePerKg;

    public Fruit(String name, double weightInKg, int pricePerKg){
        super(name);
        this.weightFruit = weightInKg;
        this.pricePerKg = pricePerKg;
    }

    public int getCost(){
        return (int) (weightFruit * pricePerKg);
    }

    public boolean equals(Object o){
        return (o instanceof Fruit)
                && (((Fruit) o).getName()==this.getName())
                && (((Fruit) o).weightFruit==this.weightFruit
                && (((Fruit) o).getCost()==this.getCost()));
    }


}
