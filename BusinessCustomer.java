public class BusinessCustomer extends Customer {

    BusinessCustomer(String n){
        this.name = n;
    }


    private Boolean ableToAccommodate() {

        Boolean able = true;
        if(Store.inventory.get("springRoll") < 2 || Store.inventory.get("eggRoll") < 2 || Store.inventory.get("pastryRoll") < 2 || Store.inventory.get("sausageRoll") < 2 || Store.inventory.get("jellyRoll")<2) { able = false; }
        return able;
    }


    public void buy(int num) {

        customerOrder = new Roll[num];

        if(!ableToAccommodate()) {

            System.out.println("We cannot take your order!");
            System.out.println(this.getName() + " leaves the store");
            soldOut++;
        }

        else if(ableToAccommodate()) {

            customerOrder[0] = new SpringRoll();
            customerOrder[1] = new SpringRoll();


            Store.inventory.put("springRoll",Store.inventory.get("springRoll") -2);

            customerOrder[2] = new EggRoll();
            customerOrder[3] = new EggRoll();
            Store.inventory.put("eggRoll",Store.inventory.get("eggRoll") - 2);

            customerOrder[4] = new PastryRoll();
            customerOrder[5] = new PastryRoll();
            Store.inventory.put("pastryRoll",Store.inventory.get("pastryRoll") - 2);

            customerOrder[6] = new SausageRoll();
            customerOrder[7] = new SausageRoll();

            Store.inventory.put("sausageRoll",Store.inventory.get("sausageRoll")-2);

            customerOrder[8] = new JellyRoll();
            customerOrder[9] = new JellyRoll();
            Store.inventory.put("jellyRoll",Store.inventory.get("jellyRoll")-2);

        }

    }
    public void print(){

        if (customerOrder[9] != null) {

            for (int i = 0; i < customerOrder.length; i++) {

                if (customerOrder[i].getName() =="Egg Roll") { this.numEgg+=1; }
                if (customerOrder[i].getName() == "Jelly Roll") { this.numJelly+=1; }
                if (customerOrder[i].getName() == "Pastry Roll") { this.numPastry+=1; }
                if (customerOrder[i].getName() == "Sausage Roll") { this.numSausage+=1; }
                if (customerOrder[i].getName() == "Spring Roll") { this.numSpr+=1; }


                totalCost+=customerOrder[i].getPrice();
                String str = String.format("%.02f", customerOrder[i].getPrice());
                System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " purchased a " + customerOrder[i].getName() + " with "
                        + customerOrder[i].getSauceNum() + " sauce(s), " + customerOrder[i].fillingNum +
                        " filling(s), and " + customerOrder[i].getToppingNum() + " topping(s) for $" + str+" dollars.");

            }
        }
        String str = String.format("%.02f", totalCost);
        System.out.println("The total cost for this order is: $" + str + " dollars.");
    }
}