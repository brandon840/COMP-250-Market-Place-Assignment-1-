package assignment1;

public class Jam extends MarketProduct{
    private int nbOfJars;
    private int pricePerJar;

    public Jam(String name, int nbOfJars, int pricePerJar){
        super(name);
        this.nbOfJars = nbOfJars;
        this.pricePerJar = pricePerJar;
    }

    public int getCost(){
        return (int) (nbOfJars * pricePerJar);
    }

    public boolean equals(Object o){
        return (o instanceof Jam)
                && (((Jam) o).getName()==this.getName())
                && (((Jam) o).nbOfJars==this.nbOfJars
                && (((Jam) o).getCost()==this.getCost()));
    }

}
