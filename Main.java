import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // test
        JUnitTest test = new JUnitTest();

        test.test_customer_factory();
        test.testAdd();
        test.getNameTest();


        // read input from user
        System.out.println("How many days would you like the Roll Store Simulator to run?");
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        System.out.println();
        Store store = new Store(days);
    }
}
