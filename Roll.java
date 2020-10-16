import java.util.Random;

public abstract class Roll {

    protected String name;
    protected double rollPrice;
    protected double saucePrice;
    protected double fillingPrice;
    protected double toppingPrice;
    protected int sauceNum;
    protected int fillingNum;
    protected int toppingNum;
    protected double totalPrice;

    public Roll(String name, double price) {

        Random rand = new Random();
        this.name = name;
        this.rollPrice = price;
        this.sauceNum = rand.nextInt(4);
        this.fillingNum = rand.nextInt(2);
        this.toppingNum = rand.nextInt(3);
    }

    public String getName()
    {
        return name;
    }

    public int getSauceNum() { return sauceNum; }

    public int getToppingNum() { return toppingNum; }

    public double getPrice(){

        this.totalPrice = rollPrice + sauceNum * saucePrice + fillingNum*fillingPrice + toppingNum * toppingPrice;
        return this.totalPrice;
    }


}