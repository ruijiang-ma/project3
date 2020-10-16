public class Counter {

    int businessSoldOut = 0, cateringSoldOut = 0, casualSoldOut = 0, allTimeSoldOut = 0;

    double businessSales = 0.0,
            causalSales = 0.0,
            cateringSales = 0.0,
            dailyTotal=0,

            allTimeBusinessSales = 0.0,
            allTimeCausalSales = 0.0,
            allTimeCateringSales = 0.0,
            allTimeTotalSales;


    int totalNumEgg = 0, totalNumSausage = 0, totalNumSpring = 0, totalNumPastry = 0, totalNumJelly = 0;


    public void resetDaily() {
        
        this.businessSales = 0.0;
        this.cateringSales = 0.0;
        this.causalSales = 0.0;
        
        this.businessSoldOut = 0;
        this.casualSoldOut = 0;
        this.cateringSoldOut = 0;
    }
    
    public void countSales(Customer customer) {

        totalNumEgg += customer.numEgg;
        totalNumJelly += customer.numJelly;
        totalNumPastry += customer.numPastry;
        totalNumSausage += customer.numSausage;
        totalNumSpring += customer.numSpr;

        if (customer.getClass().getSimpleName() == "BusinessCustomer"){
            
            businessSales += customer.getTotalCost();
            businessSoldOut += customer.getSoldOut();

            allTimeBusinessSales += customer.getTotalCost();
            allTimeSoldOut += customer.getSoldOut();

        }

        if (customer.getClass().getSimpleName() == "CasualCustomer"){
            
            causalSales += customer.getTotalCost();
            casualSoldOut += customer.getSoldOut();
            
            allTimeCausalSales += customer.getTotalCost();
            allTimeSoldOut += customer.getSoldOut();
        }


        if (customer.getClass().getSimpleName() == "CateringCustomer"){
            
            cateringSales += customer.getTotalCost();
            cateringSoldOut += customer.getSoldOut();
            
            allTimeCateringSales += customer.getTotalCost();
            allTimeSoldOut += customer.getSoldOut();
        }


    }

    public void printSales() {
        System.out.println("---------------- DAILY SUMMARY: ----------------");
        dailyTotal = businessSales + causalSales + cateringSales;
        System.out.println("Daily total business customers sale: $" + businessSales+" dollars.");
        System.out.println("Daily total catering customers sale: $" + cateringSales+" dollars.");
        System.out.println("Daily total causal customers sale: $" + causalSales+" dollars.");

        System.out.println("Daily total sales: $" + dailyTotal+" dollars.");

        System.out.println("Daily total business customer soldOut :" + businessSoldOut+".");
        System.out.println("Daily total catering customer soldOut:" + cateringSoldOut+".");
        System.out.println("Daily total casual customer soldOut:" + casualSoldOut+".");

    }

    public void printInventory() {
        System.out.println("\n-------------------------------- INVENTORY SUMMARY: --------------------------------");
        System.out.println("Spring roll stock level: " + Store.inventory.get("springRoll")+".");
        System.out.println("Egg roll stock level: " + Store.inventory.get("eggRoll")+".");
        System.out.println("Pastry roll stock level: " + Store.inventory.get("pastryRoll")+".");
        System.out.println("Sausage roll stock level: " + Store.inventory.get("sausageRoll")+".");
        System.out.println("Jelly roll stock level: " + Store.inventory.get("jellyRoll")+".\n");

        //System.out.println("\n****************************************************************");
    }

    public void printAllTimeSale() {
        
        allTimeTotalSales = allTimeBusinessSales + allTimeCateringSales + allTimeCausalSales;
        System.out.println("\n-------------------------------- ALL TIME SUMMARY: --------------------------------");
        System.out.println("All time business customers sale: $" + allTimeBusinessSales+" dollars.");
        System.out.println("All time catering customers sale: $" + allTimeCateringSales+" dollars.");
        System.out.println("All time causal customers sale: $" + allTimeCausalSales+" dollars.");

        System.out.println("All time sales: $" + allTimeTotalSales+" dollars.");

        System.out.println("All time sold out times: " + allTimeSoldOut+".");

        System.out.println("All time egg roll sold: " + totalNumEgg+".");
        System.out.println("All time spring roll sold: " + totalNumSpring+".");
        System.out.println("All time jelly roll sold: " + totalNumJelly+".");
        System.out.println("All time pastry roll sold: " + totalNumPastry+".");
        System.out.println("All time sausage roll sold: " + totalNumSausage+".");


    }

}
