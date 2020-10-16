public class BusinessCustomer extends Customer {

    BusinessCustomer(String n){
        this.name = n;
    }

    private Boolean isCompleteOrder() {

        Boolean x = true;
        if(Store.inventory.get("springRoll") < 2 || Store.inventory.get("eggRoll") < 2 || Store.inventory.get("pastryRoll") < 2 || Store.inventory.get("sausageRoll") < 2 || Store.inventory.get("jellyRoll")<2) { x = false; }
        return x;
    }


    public void purchaseRolls(int rollsWanted) {

        rollOrder = new Roll[rollsWanted];

        if(!isCompleteOrder()) {

            System.out.println("Sorry " + this.getName() + "! The order can not be fulfilled!");
            System.out.println(this.getName() + " exits the store.");
            soldOut++;
        }

        else if(isCompleteOrder()) {

            rollOrder[0] = new SpringRoll();
            rollOrder[1] = new SpringRoll();


            Store.inventory.put("springRoll",Store.inventory.get("springRoll") -2);

            rollOrder[2] = new EggRoll();
            rollOrder[3] = new EggRoll();
            Store.inventory.put("eggRoll",Store.inventory.get("eggRoll") - 2);

            rollOrder[4] = new PastryRoll();
            rollOrder[5] = new PastryRoll();
            Store.inventory.put("pastryRoll",Store.inventory.get("pastryRoll") - 2);

            rollOrder[6] = new SausageRoll();
            rollOrder[7] = new SausageRoll();

            Store.inventory.put("sausageRoll",Store.inventory.get("sausageRoll")-2);

            rollOrder[8] = new JellyRoll();
            rollOrder[9] = new JellyRoll();
            Store.inventory.put("jellyRoll",Store.inventory.get("jellyRoll")-2);

        }

    }
    public void print(){

        if (rollOrder[9] != null) {

            for (int i = 0; i < rollOrder.length; i++) {


                totalCost+=rollOrder[i].getPrice();
                String str = String.format("%.02f", rollOrder[i].getPrice());
                System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " purchased a " + rollOrder[i].getName() + " with "
                        + rollOrder[i].getSauceNum() + " sauce(s), " + rollOrder[i].fillingNum +
                        " filling(s), and " + rollOrder[i].getToppingNum() + " topping(s) for $" + str+" dollars.");

            }
        }
        String str = String.format("%.02f", totalCost);
        System.out.println("The total cost for this order is: $" + str + " dollars.");
    }
}