public abstract class Customer{

    protected String name;
    public Roll[] rollOrder;
    public int rollsBought=0, soldOut;
    double totalCost = 0.0;
    
    public String getName(){
        return name;
    }
    public abstract void purchaseRolls(int rollNum);
    public abstract void print();
    public double getTotalCost(){ return this.totalCost; }
    public int getSoldOut(){ return this.soldOut; }

    
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