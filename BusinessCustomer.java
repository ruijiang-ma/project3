public class BusinessCustomer extends Customer {

    BusinessCustomer(String n){
        this.name = n;
    }
    
    // To check if there are enough rolls for business customers.
    //Business customers will buy 10 rolls, two of each type.
    //A business customer will only take their order if it is filled exactly as requested, otherwise, they will not make a purchase.
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
            
            //Spring roll
            customerOrder[0] = new SpringRoll();
            customerOrder[1] = new SpringRoll();
            Store.inventory.put("springRoll",Store.inventory.get("springRoll") - 2);
            
            //Egg roll
            customerOrder[2] = new EggRoll();
            customerOrder[3] = new EggRoll();
            Store.inventory.put("eggRoll",Store.inventory.get("eggRoll") - 2);
            
            //Pastry roll
            customerOrder[4] = new PastryRoll();
            customerOrder[5] = new PastryRoll();
            Store.inventory.put("pastryRoll",Store.inventory.get("pastryRoll") - 2);
            
            //Sausage roll
            customerOrder[6] = new SausageRoll();
            customerOrder[7] = new SausageRoll();
            Store.inventory.put("sausageRoll",Store.inventory.get("sausageRoll") - 2);
            
            //jelly roll
            customerOrder[8] = new JellyRoll();
            customerOrder[9] = new JellyRoll();
            Store.inventory.put("jellyRoll",Store.inventory.get("jellyRoll") - 2);

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

                //To calculate the total cost of the order.
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
