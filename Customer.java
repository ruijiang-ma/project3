import java.util.Random;

public abstract class Customer{

    protected String name;
    public Roll[] customerOrder;
    public int rollsBought=0, soldOut;
    double totalCost = 0.0;

    public int index = 0;
    public int numEgg = 0;
    public int numJelly = 0;
    public int numPastry = 0;
    public int numSpr = 0;
    public int numSausage = 0;

    
    public String getName(){
        return name;
    }
    public abstract void buy(int num);
    public abstract void print();
    public double getTotalCost(){ return this.totalCost; }
    public int getSoldOut(){ return this.soldOut; }



    public int[] shuffleArray() {

        int[] array = { 1, 2, 3, 4, 5};

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }

    
    public Boolean canBuy(String name, int numRolls) {
        
        Boolean x = false;
        if(name == "Egg Roll") {
            if (Store.inventory.get("eggRoll") - numRolls >= 0) {
                x = true;
            }
        }

        if (name =="Spring Roll") {
            if(Store.inventory.get("springRoll")-numRolls >= 0){
                x = true;
            }
        }
        if(name =="Pastry Roll") {
            if(Store.inventory.get("pastryRoll")-numRolls >= 0) {
                x = true;
            }
        }
        if(name =="Sausage Roll"){
            if(Store.inventory.get("sausageRoll")-numRolls >= 0) {
                x = true;
            }
        }
        if(name =="Jelly Roll") {
            if(Store.inventory.get("jellyRoll")-numRolls >= 0) {
                x = true;
            }
        }
        return x;
    }
}