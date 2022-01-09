package assignment1;


public class Egg extends MarketProduct {

    private int nbOfEggs;
    private int pricePerDozen;

    public Egg(String name, int nbRequired, int pricePerDozen){
        super(name);
        this.nbOfEggs = nbRequired;
        this.pricePerDozen = pricePerDozen;

    }

    public int getCost(){
        return (int) ((nbOfEggs/12.0) * pricePerDozen);
    }

    public boolean equals(Object o){
        return (o instanceof Egg)
                && (((Egg) o).getName()==this.getName())
                && (((Egg) o).getCost()==this.getCost()
                && (((Egg) o).nbOfEggs==this.nbOfEggs));
    }





}
