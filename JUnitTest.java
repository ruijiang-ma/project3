import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {

    @Test
    public void testCustomerFactory() {
        System.out.print("test CuastomerFactory...");
        assertTrue("failure - CustomerFactory.create(Customer[])", CustomerFactory.createCustomer() instanceof Customer[]);
        System.out.println("ok");

    }


    public void testAdd(){
        Roll springRoll = RollFactory.createRoll("Spring Roll");
        Roll eggRoll = RollFactory.createRoll("Egg Roll");
        double price1 = springRoll.rollPrice;
        double price2 = eggRoll.rollPrice;

        double result = price1 + price2;
        assertTrue(result == 13.5);
        System.out.println("testAdd()...ok");
    }

    @Test
    public void testGetName () {

        String message = "Sausage Roll";
        SausageRoll sausageRoll = new SausageRoll();
        assertEquals(message, sausageRoll.getName());
        System.out.println("Inside testgetName()...ok");

    }

}
