public class Counter {

    double businessSales = 0.0, causalSales = 0.0, cateringSales = 0.0;
    double dailyTotal;
    int businessSoldOut = 0, cateringSoldOut = 0, casualSoldOut = 0;


    public void resetDaily(){
        this.businessSales = 0.0;
        this.cateringSales = 0.0;
        this.causalSales = 0.0;
        this.businessSoldOut = 0;
        this.casualSoldOut = 0;
        this.casualSoldOut = 0;
    }




    public void countSales(Customer customer){

        if (customer.getClass().getSimpleName() == "BusinessCustomer"){
            businessSales += customer.getTotalCost();
            businessSoldOut += customer.getSoldOut();
        }

        if (customer.getClass().getSimpleName() == "CasualCustomer"){
            causalSales += customer.getTotalCost();
            casualSoldOut += customer.getSoldOut();
        }


        if (customer.getClass().getSimpleName() == "CateringCustomer"){
            cateringSales += customer.getTotalCost();
            cateringSoldOut += customer.getSoldOut();
        }

    }

    public void printSales() {
        dailyTotal = businessSales + causalSales + cateringSales;
        if (dailyTotal != 0.0) {
            System.out.println("Daily total business customer sale :" + businessSales);
            System.out.println("Daily total business customer sale :" + cateringSales);
            System.out.println("Daily total business customer sale :" + causalSales);

            System.out.println("Daily total sales " + dailyTotal);

            System.out.println("Daily total business customer soldOut :" + businessSoldOut);
            System.out.println("Daily total catering customer soldOut:" + cateringSoldOut);
            System.out.println("Daily total casual customer soldOut:" + casualSoldOut);
        }
        else{
            System.out.println("customerOrder");
        }
    }

    public void printInventory() {
        System.out.println("Spring Roll Stock: " + Store.inventory.get("springRoll"));
        System.out.println("Egg Roll Stock: " + Store.inventory.get("eggRoll"));
        System.out.println("Pastry Roll Stock: " + Store.inventory.get("pastryRoll"));
        System.out.println("Sausage Roll Stock: " + Store.inventory.get("sausageRoll"));
        System.out.println("Jelly Roll Stock: " + Store.inventory.get("jellyRoll"));

    }

}
