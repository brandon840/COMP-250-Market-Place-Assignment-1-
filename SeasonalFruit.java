package assignment1;

public class SeasonalFruit extends Fruit{

    public SeasonalFruit(String name, double weightKg, int pricePerKg){
        super(name,weightKg,pricePerKg);
    }

    public int getCost(){
        return (int) (super.getCost() * 0.85);
    }

}
