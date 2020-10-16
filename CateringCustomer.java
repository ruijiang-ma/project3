public class CateringCustomer extends Customer {

    CateringCustomer(String n){
        this.name = n;
    }


    public void buy(int num) {

        //Catering customers will buy 5 rolls of 3 different types (15 total, type determined randomly). 
        //A catering customer will take any number of available rolls of any available types up to a total of 15, if their original order cannot be placed. 
        int currentNumOfRolls = Store.inventory.get("springRoll") + Store.inventory.get("eggRoll") + Store.inventory.get("pastryRoll") + Store.inventory.get("sausageRoll") + Store.inventory.get("jellyRoll");

        if (currentNumOfRolls >= 1) {

            customerOrder = new Roll[num];
            int[] array = shuffleArray();
                if (array[0] == 1 || array[1] == 1 || array[2] == 1) {
                    //Spring roll
                    if (canBuy("Spring Roll", 5)) {
                        
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();

                        Store.inventory.put("springRoll", Store.inventory.get("springRoll") - 5);
                    } else if (canBuy("Spring Roll", 4)) {

                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();

                        Store.inventory.put("springRoll", Store.inventory.get("springRoll") - 4);
                    } else if (canBuy("Spring Roll", 3)) {

                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();

                        Store.inventory.put("springRoll", Store.inventory.get("springRoll") - 3);
                    } else if (canBuy("Spring Roll", 2)) {

                        customerOrder[index++] = new SpringRoll();
                        customerOrder[index++] = new SpringRoll();

                        Store.inventory.put("springRoll", Store.inventory.get("springRoll") - 2);
                    } else if (canBuy("Spring Roll", 1)) {

                        customerOrder[index++] = new SpringRoll();

                        Store.inventory.put("springRoll", Store.inventory.get("springRoll") - 1);
                    }
                }
                if (array[0] == 2 || array[1] == 2 || array[2] == 2) {
                    //Egg roll
                    if (canBuy("Egg Roll", 5)) {
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        Store.inventory.put("eggRoll", Store.inventory.get("eggRoll") - 5);
                    } else if (canBuy("Egg Roll", 4)) {
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        Store.inventory.put("eggRoll", Store.inventory.get("eggRoll") - 4);
                    } else if (canBuy("Egg Roll", 3)) {
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        Store.inventory.put("eggRoll", Store.inventory.get("eggRoll") - 3);
                    } else if (canBuy("Egg Roll", 2)) {
                        customerOrder[index++] = new EggRoll();
                        customerOrder[index++] = new EggRoll();
                        Store.inventory.put("eggRoll", Store.inventory.get("eggRoll") - 2);
                    } else if (canBuy("Egg Roll", 1)) {
                        customerOrder[index++] = new EggRoll();
                        Store.inventory.put("eggRoll", Store.inventory.get("eggRoll") - 1);
                    }

                }
                if (array[0] == 3 || array[1] == 3 || array[2] == 3) {
                    //Pastry roll
                    if (canBuy("Pastry Roll", 5)) {
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();

                        Store.inventory.put("pastryRoll", Store.inventory.get("pastryRoll") - 5);
                    } else if (canBuy("Pastry Roll", 4)) {
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        Store.inventory.put("pastryRoll", Store.inventory.get("pastryRoll") - 4);
                    } else if (canBuy("Pastry Roll", 3)) {
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        Store.inventory.put("pastryRoll", Store.inventory.get("pastryRoll") - 3);
                    } else if (canBuy("Pastry Roll", 2)) {
                        customerOrder[index++] = new PastryRoll();
                        customerOrder[index++] = new PastryRoll();
                        Store.inventory.put("pastryRoll", Store.inventory.get("pastryRoll") - 2);
                    } else if (canBuy("Pastry Roll", 1)) {
                        customerOrder[index++] = new PastryRoll();
                        Store.inventory.put("pastryRoll", Store.inventory.get("pastryRoll") - 1);
                    }

                }
                if (array[0] == 4 || array[1] == 4 || array[2] == 4) {
                    //Sausage roll
                    if (canBuy("Sausage Roll", 5)) {
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        Store.inventory.put("sausageRoll", Store.inventory.get("sausageRoll") - 5);
                    } else if (canBuy("Sausage Roll", 4)) {
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        Store.inventory.put("sausageRoll", Store.inventory.get("sausageRoll") - 4);
                    } else if (canBuy("Sausage Roll", 3)) {
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        Store.inventory.put("sausageRoll", Store.inventory.get("sausageRoll") - 3);
                    }
                    else if (canBuy("Sausage Roll", 2)) {
                        customerOrder[index++] = new SausageRoll();
                        customerOrder[index++] = new SausageRoll();
                        Store.inventory.put("sausageRoll", Store.inventory.get("sausageRoll") - 2);
                    } else if (canBuy("Sausage Roll", 1)) {
                        customerOrder[index++] = new SausageRoll();
                        Store.inventory.put("sausageRoll", Store.inventory.get("sausageRoll") - 1);
                    }

                }
                if (array[0] == 5 || array[1] == 5 || array[2] == 5) {
                    //Jelly roll
                    if (canBuy("Jelly Roll", 5)) {
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        Store.inventory.put("jellyRoll", Store.inventory.get("jellyRoll") - 5);
                    } else if (canBuy("Jelly Roll", 4)) {
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        Store.inventory.put("jellyRoll", Store.inventory.get("jellyRoll") - 4);
                    } else if (canBuy("Jelly Roll", 3)) {
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        Store.inventory.put("jellyRoll", Store.inventory.get("jellyRoll") - 3);
                    } else if (canBuy("Jelly Roll", 2)) {
                        customerOrder[index++] = new JellyRoll();
                        customerOrder[index++] = new JellyRoll();
                        Store.inventory.put("jellyRoll", Store.inventory.get("jellyRoll") - 2);
                    } else if (canBuy("Jelly Roll", 1)) {
                        customerOrder[index++] = new JellyRoll();
                        Store.inventory.put("jellyRoll", Store.inventory.get("jellyRoll") - 1);
                    }
                }
        }
        else {
            soldOut++;
            System.out.println("We have sold out for catering customer!");
        }
    }
    public void print(){
        //to calculate the total cost of the order
        printFun(index);
    }
}
