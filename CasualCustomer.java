import java.util.Random;

public class CasualCustomer extends Customer {

    CasualCustomer(String n){
        this.name = n;
    }


    public void purchaseRolls(int rollsWanted)
    {
        Random rand = new Random();

        rollOrder = new Roll[rollsWanted];
        rollsBought = 0;

        int rollType = 0;
        int index = 0;
        while(rollsBought<rollsWanted)
        {
            rollType = rand.nextInt(5) + 1;
            if (rollType == 1) {

                //Spring Roll
                System.out.println(this.getName() + " wants a Spring Roll.");
                if(canBuy("Spring Roll",1)) {

                    rollOrder[index++] = new SpringRoll();

                    Store.inventory.put("springRoll",Store.inventory.get("springRoll")-1);
                    rollsBought++;
                }
                else {
                    soldOut++;
                }
            }

            else if(rollType==2)
            {
                //Egg Roll
                System.out.println(this.getName() + " wants an Egg Roll.");
                if(canBuy("Egg Roll",1)){
                    rollOrder[index++] = new EggRoll();
                    Store.inventory.put("eggRoll",Store.inventory.get("eggRoll") - 1);
                    rollsBought++;
                }
                else{
                    soldOut++;
                }
            }
            else if(rollType==3) {
                //Pastry Roll
                System.out.println(this.getName() + " wants a Pastry Roll.");
                if(canBuy("Pastry Roll",1)){
                    rollOrder[index++] = new PastryRoll();
                    Store.inventory.put("pastryRoll",Store.inventory.get("pastryRoll") - 1);
                    rollsBought++;
                }
                else{
                    soldOut++;
                }
            }
            else if(rollType==4)
            {
                //Sausage Roll
                System.out.println(this.getName() + " wants a Sausage Roll.");
                if(canBuy("Sausage Roll",1)){
                    rollOrder[index++] = new SausageRoll();
                    Store.inventory.put("sausageRoll",Store.inventory.get("sausageRoll")-1);
                    rollsBought++;
                }
                else{
                    soldOut++;
                   // System.out.println("Sausage Rolls are currently SOLD OUT! Sorry " + getName() + "!");
                }
            }
            else if(rollType==5)
            {
                //Jelly Roll
                System.out.println(getName() + " wants a Jelly Roll.");
                if(canBuy("Jelly Roll",1)) {
                    rollOrder[index++] = new JellyRoll();
                    Store.inventory.put("jellyRoll",Store.inventory.get("jellyRoll")-1);
                    rollsBought++;
                }
                else {
                    soldOut++;
                    //System.out.println("Jelly Rolls are currently SOLD OUT! Sorry " + this.getName() + "!");
                }
            }
        }
    }

    public void print(){

        for (int i = 0; i < rollOrder.length; i++){

            totalCost+=rollOrder[i].getPrice();
            String str = String.format("%.02f", rollOrder[i].getPrice());
            System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " purchased a " + rollOrder[i].getName() + " with "
                    + rollOrder[i].getSauceNum() + " sauce(s), " + rollOrder[i].fillingNum +
                    " filling(s), and " + rollOrder[i].getToppingNum() + " topping(s) for $" + str+" dollars.");

        }

        String str = String.format("%.02f", totalCost);
        System.out.println("The total cost for this order is: $" + str + " dollars.");
    }




}