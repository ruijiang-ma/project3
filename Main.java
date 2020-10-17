import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        JUnitTest test = new JUnitTest();

        test.testCustomerFactory();
        test.testAdd();
        test.testGetName();
        test.testEggRoll();
        test.testCounter();
        test.testFactory();
        test.testBusinessCustomr();
        test.testPastryRoll();


        //Ask users to input a value and read the value.
        System.out.println("\nHello, and welcome! How many days would you like the Roll Store Simulator to run?");
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        System.out.println();
        Store store = new Store(days);
    }
}
