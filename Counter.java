public class Counter {

    double businessSales = 0.0, causalSales = 0.0, cateringSales = 0.0;
    double dailyTotal;
    int businessSoldOut = 0, cateringSoldOut = 0, casualSoldOut = 0;

    double allTimeBusinessSales = 0.0, allTimeCausalSales = 0.0, allTimeCateringSales = 0.0;
    double allTimeTotal, allTImeSoutOld = 0;

    int totalEgg = 0, totalSausauge = 0, totalSpr = 0, totalPastry = 0, totalJelly = 0;


    public void resetDaily(){
        this.businessSales = 0.0;
        this.cateringSales = 0.0;
        this.causalSales = 0.0;
        this.businessSoldOut = 0;
        this.casualSoldOut = 0;
        this.casualSoldOut = 0;
    }




    public void countSales(Customer customer) {

        totalEgg+=customer.numEgg;
        totalJelly+=customer.numJelly;
        totalPastry+=customer.numPastry;
        totalSausauge+=customer.numSausage;
        totalSpr+=customer.numSpr;

        if (customer.getClass().getSimpleName() == "BusinessCustomer"){
            businessSales += customer.getTotalCost();
            allTimeBusinessSales+=customer.getTotalCost();
            businessSoldOut += customer.getSoldOut();
            allTImeSoutOld += customer.getSoldOut();

        }

        if (customer.getClass().getSimpleName() == "CasualCustomer"){
            causalSales += customer.getTotalCost();
            casualSoldOut += customer.getSoldOut();
            allTimeCausalSales+=customer.getTotalCost();
            allTImeSoutOld += customer.getSoldOut();
        }


        if (customer.getClass().getSimpleName() == "CateringCustomer"){
            cateringSales += customer.getTotalCost();
            cateringSoldOut += customer.getSoldOut();
            allTimeCateringSales+=customer.getTotalCost();
            allTImeSoutOld+=customer.getSoldOut();
        }


    }

    public void printSales() {
        dailyTotal = businessSales + causalSales + cateringSales;
        System.out.println("Daily total business customer sale :" + businessSales);
        System.out.println("Daily total business customer sale :" + cateringSales);
        System.out.println("Daily total business customer sale :" + causalSales);

        System.out.println("Daily total sales " + dailyTotal);

        System.out.println("Daily total business customer soldOut :" + businessSoldOut);
        System.out.println("Daily total catering customer soldOut:" + cateringSoldOut);
        System.out.println("Daily total casual customer soldOut:" + casualSoldOut);

    }

    public void printInventory() {
        System.out.println("Spring Roll Stock: " + Store.inventory.get("springRoll"));
        System.out.println("Egg Roll Stock: " + Store.inventory.get("eggRoll"));
        System.out.println("Pastry Roll Stock: " + Store.inventory.get("pastryRoll"));
        System.out.println("Sausage Roll Stock: " + Store.inventory.get("sausageRoll"));
        System.out.println("Jelly Roll Stock: " + Store.inventory.get("jellyRoll"));

    }

    public void printAllTimeSale() {
        allTimeTotal = allTimeBusinessSales + allTimeCateringSales + allTimeCausalSales;

        System.out.println("All time total business customer sale :" + allTimeBusinessSales);
        System.out.println("All time total business customer sale :" + allTimeCateringSales);
        System.out.println("All time total business customer sale :" + allTimeCausalSales);

        System.out.println("Daily total sales " + allTimeTotal);

        System.out.println("All time soldOut :" + allTImeSoutOld);
        System.out.println("All time egg "+totalEgg);
        System.out.println("All time spr "+totalSpr);
        System.out.println("All time jelly "+totalJelly);
        System.out.println("All time pastry "+totalPastry);
        System.out.println("All time sausauge "+totalSausauge);


    }

}
