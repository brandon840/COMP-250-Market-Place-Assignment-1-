package assignment1;

public class Customer {
    private String name;
    private int myBalance;
    private Basket myBasket;

    public Customer(String name, int initialBalance){
        this.myBasket = new Basket();
        this.name = name;
        this.myBalance = initialBalance;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.myBalance;
    }

    public Basket getBasket() {
        return this.myBasket;
    }

    public int addFunds(int funds){
        if (funds<0){
            throw new IllegalArgumentException("Please enter a positive integer.");
        }
        this.myBalance += funds;
        return this.myBalance;
    }

    public void addToBasket(MarketProduct mp){
        this.myBasket.add(mp);
    }

    public boolean removeFromBasket(MarketProduct mp){
        return this.myBasket.remove(mp);
    }

    public String checkOut(){
        if (myBalance < myBasket.getTotalCost()){
            throw new IllegalStateException("You are too poor!");
        }else{
            myBalance -= myBasket.getTotalCost();
            String temp = myBasket.toString();
            myBasket.clear();
            return temp;
        }

    }
}
