import java.util.HashMap;
import java.util.Random;

public class Store {

    private final int LIMIT = 30;
    private Customer[] customers;
    public static HashMap<String, Integer> inventory = new HashMap<String, Integer>();
    public static Boolean nothingLeft = false;
    Counter counter = new Counter();

    public Store(int day) {

        System.out.println("******** Welcome to our 4448 Roll store. ********\n");
        inventory.put("springRoll", LIMIT);
        inventory.put("eggRoll", LIMIT);
        inventory.put("pastryRoll",LIMIT);
        inventory.put("sausageRoll", LIMIT);
        inventory.put("jellyRoll", LIMIT);

        for(int i=1 ; i <= day ; i++) {

            System.out.println("******** Today is Day " + i + ". ********\n");
            this.setInventory();
            counter.printInventory();
            counter.resetDaily();

            CustomerFactory factory = new CustomerFactory();
            customers = factory.createCustomer();
            this.customerSimulator();

            counter.printSales();
            counter.printInventory();

            System.out.println("\n******** End of Day " + i + ". ********\n");
        }
        counter.printAllTimeSale();
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

        if (inventory.get("springRoll") == 0 && inventory.get("eggRoll") ==0 && inventory.get("pastryRoll") ==0 && inventory.get("sausageRoll") ==0 && inventory.get("jellyRoll") == 0)
        { this.nothingLeft = true; }
        return this.nothingLeft;

    }

    public void checkWhichRunOut(){

        if (Store.inventory.get("eggRoll") == 0 ){
            System.out.println("Egg Rolls ran out!");
        }
        if (Store.inventory.get("springRoll") == 0 ){
            System.out.println("Spring Rolls ran out!");
        }
        if (Store.inventory.get("jellyRoll") == 0 ){
            System.out.println("Jelly Rolls ran out!");
        }
        if (Store.inventory.get("sausageRoll") == 0 ){
            System.out.println("Sausage Rolls ran out!");
        }

        if (Store.inventory.get("pastryRoll") == 0 ){
            System.out.println("Pastry Rolls ran out!");
        }
    }

    public void customerSimulator() {
        Random rand = new Random();
        int num = 0;
        for(int i=0; i < customers.length; i++)
        {
            if (!nothingLeft()) {

                if (customers[i].getClass().getSimpleName().equals("CasualCustomer")) {
                    num = rand.nextInt(3) +1;
                } else if (customers[i].getClass().getSimpleName().equals("CateringCustomer")) {
                    num = 15;
                } else if (customers[i].getClass().getSimpleName().equals("BusinessCustomer")) {
                    num = 10;
                }

                System.out.println(customers[i].getName() + " the " + customers[i].getClass().getSimpleName() + " entered the store and want to buy " + num + " roll(s).");
                customers[i].buy(num);
                this.checkWhichRunOut();

                customers[i].print();
                
                counter.countSales(customers[i]);
            }

            else {
                System.out.println("Everything is sold out! Come back the next day!");
                this.nothingLeft = false;
                break;
            }

        }
    }
}