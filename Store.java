import java.util.HashMap;
import java.util.Random;

public class Store {

    private final int LIMIT = 30;
    private Customer[] customers;
    public static HashMap<String, Integer> inventory = new HashMap<String, Integer>();
    Boolean nothingLeft = false;
    Counter counter = new Counter();


    public Store(int day) {

        System.out.println("******** Welcome to our 4448 Roll store ********\n");
        inventory.put("springRoll", LIMIT);
        inventory.put("eggRoll", LIMIT);
        inventory.put("pastryRoll",LIMIT);
        inventory.put("sausageRoll", LIMIT);
        inventory.put("jellyRoll", LIMIT);

        for(int i=1 ; i <= day ; i++) {

            System.out.println("Today is Day " + i + ".");
            this.setInventory();
            counter.printInventory();
            counter.resetDaily();

            customers = CustomerFactory.createCustomer();
            this.customerSimulator();

            counter.printSale();
            counter.printInventory();

            System.out.println("End of Day " + i + ".");
        }
    }

    public void setInventory() {

        if (inventory.get("springRoll") == 0) {
            
            inventory.put("springRoll", LIMIT);
        }
        if (inventory.get("eggRoll") == 0){
            
            inventory.put("eggRoll", LIMIT);
        }
        if (inventory.get("pastryRoll") == 0){
            
            inventory.put("pastryRoll", LIMIT);
        }
        if (inventory.get("sausageRoll") == 0){
            
            inventory.put("sausageRoll", LIMIT);
        }
        if (inventory.get("jellyRoll") == 0){
            
            inventory.put("jellyRoll", LIMIT);
        }
    }

    public boolean nothingLeft() {

        if (Store.inventory.get("springRoll") == 0 && Store.inventory.get("eggRoll") ==0 && Store.inventory.get("pastryRoll") ==0 && Store.inventory.get("sausageRoll") ==0 && Store.inventory.get("jellyRoll") == 0)
        { this.nothingLeft = true; }
        return this.nothingLeft;

    }

    public void eggRunOut(){
        if (Store.inventory.get("eggRoll") == 0 ){
            System.out.println("Egg Roll run out!");
        }
    }
    public void springRunOut(){
        if (Store.inventory.get("springRoll") == 0 ){
            System.out.println("Spring Roll run out!");
        }
    }
    public void jellyRunOut(){
        if (Store.inventory.get("jellyRoll") == 0 ){
            System.out.println("Jelly Roll run out!");
        }
    }
    public void sausageRunOut(){
        if (Store.inventory.get("sausageRoll") == 0 ){
            System.out.println("Sausage Roll run out!");
        }
    }
    public void pastryRunOut(){
        if (Store.inventory.get("pastryRoll") == 0 ){
            System.out.println("Pastry Roll run out!");
        }
    }



    public void customerSimulator() {
        Random rand = new Random();
        int quantity = 0;
        for(int i=0; i < customers.length; i++)
        {
            if (!this.nothingLeft()) {

                if (customers[i].getClass().getSimpleName().equals("CasualCustomer")) {
                    quantity = rand.nextInt(2) + 1;
                } else if (customers[i].getClass().getSimpleName().equals("CateringCustomer")) {
                    quantity = 15;
                } else if (customers[i].getClass().getSimpleName().equals("BusinessCustomer")) {
                    quantity = 10;
                }

                System.out.println(customers[i].getName() + " the " + customers[i].getClass().getSimpleName() + " entered the store and is looking to buy " + quantity + " roll(s).");
                customers[i].purchaseRolls(quantity);
                this.jellyRunOut();
                this.eggRunOut();
                this.sausageRunOut();
                this.pastryRunOut();
                this.springRunOut();
                
                customers[i].print();
                
                counter.countSales(customers[i]);
            }
            else {
                System.out.println("We sold out! Come back the next day!");
                break;
            }

        }
    }
}