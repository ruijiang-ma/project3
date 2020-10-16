public class BusinessCustomer extends Customer {

    BusinessCustomer(String name){

        this.name = name;
    }

    private Boolean ableToAccommodate() {

        Boolean bool = true;
        if( Store.inventory.get("springRoll") < 2 || Store.inventory.get("eggRoll") < 2 || Store.inventory.get("pastryRoll") < 2 || Store.inventory.get("sausageRoll") < 2 || Store.inventory.get("jellyRoll")<2) { bool = false; }
        return bool;
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
            printFun(customerOrder.length);
        }

    }
}