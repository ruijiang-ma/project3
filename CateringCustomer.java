import java.util.Random;

public class CateringCustomer extends Customer {

    CateringCustomer(String n){
        this.name = n;
    }

    public int index = 0;

    public void buy(int num) {

        int currentNumOfRolls = Store.inventory.get("springRoll") + Store.inventory.get("eggRoll") + Store.inventory.get("pastryRoll") + Store.inventory.get("sausageRoll") + Store.inventory.get("jellyRoll");

        if (currentNumOfRolls >= 1) {

            customerOrder = new Roll[num];
            int[] array = shuffleArray();
                if (array[0] == 1 || array[1] == 1 || array[2] == 1) {

                    //Spring Roll
                    System.out.println(this.getName() + " wants a Spring Roll.");
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
                    //Egg Roll
                    System.out.println(this.getName() + " wants an Egg Roll.");
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
                    //Pastry Roll
                    System.out.println(this.getName() + " wants a Pastry Roll.");
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
                    //Sausage Roll
                    System.out.println(this.getName() + " wants a Sausage Roll.");
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
                    //Jelly Roll
                    System.out.println(getName() + " wants a Jelly Roll.");
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
           // }
            System.out.println(customerOrder.length);
            System.out.println(index);
        }
        else {
            soldOut++;
            System.out.println("We have sold out for catering customer!");
        }
    }
    public void print(){

        for (int i = 0; i < index; i++) {

            totalCost += customerOrder[i].getPrice();
            String str = String.format("%.02f", customerOrder[i].getPrice());
            System.out.println(this.getName() + " the " + this.getClass().getSimpleName() + " Bought a " + customerOrder[i].getName() + " with "
                    + customerOrder[i].getSauceNum() + " sauce(s), " + customerOrder[i].fillingNum +
                    " filling(s), and " + customerOrder[i].getToppingNum() + " topping(s) for $" + str+" dollars.");
        }
        String str = String.format("%.02f", totalCost);
        System.out.println("The total cost for this order is: $" + str + " dollars.");
    }
}