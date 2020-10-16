public class CasualCustomer extends Customer {

    CasualCustomer(String n){
        this.name = n;
    }
    public int index = 0;


    public void buy(int num) {
        
        // To check if there are enough rolls for casual customers.
        //Casual customers will buy 1 to 3 rolls (type determined randomly).  
        //A casual customer will try to select a different roll type to make up their 1 to 3 roll order if the initial one they select is out for the day.  
        int currentNumOfRolls = Store.inventory.get("springRoll") + Store.inventory.get("eggRoll") + Store.inventory.get("pastryRoll") + Store.inventory.get("sausageRoll") + Store.inventory.get("jellyRoll");

        if (currentNumOfRolls >= 1) {

            customerOrder = new Roll[num];
            int[] array = shuffleArray();
            if (array[0] == 1 || array[1] == 1 || array[2] == 1) {

                //Spring roll
                if (canBuy("Spring Roll", 1) && index < num) {

                    customerOrder[index++] = new SpringRoll();

                    Store.inventory.put("springRoll", Store.inventory.get("springRoll") - 1);
                }
            }
            if (array[0] == 2 || array[1] == 2 || array[2] == 2) {
                //Egg roll
                if (canBuy("Egg Roll", 1) && index < num) {
                    customerOrder[index++] = new EggRoll();
                    Store.inventory.put("eggRoll", Store.inventory.get("eggRoll") - 1);
                }

            }
            if (array[0] == 3 || array[1] == 3 || array[2] == 3) {
                //Pastry roll
                if (canBuy("Pastry Roll", 1) && index < num) {
                    customerOrder[index++] = new PastryRoll();
                    Store.inventory.put("pastryRoll", Store.inventory.get("pastryRoll") - 1);
                    rollsBought += 1;
                }

            }
            if (array[0] == 4 || array[1] == 4 || array[2] == 4) {
                //Sausage roll
                if (canBuy("Sausage Roll", 1) && index < num) {
                    customerOrder[index++] = new SausageRoll();
                    Store.inventory.put("sausageRoll", Store.inventory.get("sausageRoll") - 1);
                    rollsBought += 1;
                }

            }
            if (array[0] == 5 || array[1] == 5 || array[2] == 5) {
                //Jelly roll
                if (canBuy("Jelly Roll", 1) && index < num) {
                    customerOrder[index++] = new JellyRoll();
                    Store.inventory.put("jellyRoll", Store.inventory.get("jellyRoll") - 1);
                    rollsBought += 1;
                }
            }
        }
        else {
            soldOut++;
            System.out.println("We have sold out for casual customer!");
        }
    }

    public void print( ) {

        //To calculate the total cost of the order.
        printFun(index);
    }
}
