import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {

    @Test
    public void testCustomerFactory() {

        assertTrue("failure - CustomerFactory.create(Customer[])", CustomerFactory.createCustomer() instanceof Customer[]);
        System.out.println("test CustomerFactory...ok");
    }

    @Test
    public void testAdd(){
        Roll springRoll = RollFactory.createRoll("Spring Roll");
        Roll eggRoll = RollFactory.createRoll("Egg Roll");
        double price1 = springRoll.rollPrice;
        double price2 = eggRoll.rollPrice;
        double result = price1 + price2;
        assertTrue(result == 13.5);
        System.out.println("test Add()...ok");
    }

    @Test
    public void testGetName () {

        String message = "Sausage Roll";
        SausageRoll sausageRoll = new SausageRoll();
        assertEquals(message, sausageRoll.getName());
        System.out.println("test Sausage.getName()...ok");
    }

    @Test
    public void testEggRoll () {

        EggRoll eggRoll  = new EggRoll();
        assertTrue("failure", eggRoll instanceof Roll);
        System.out.println("test store datatype...ok");
    }

    public void testFactory () {

        RollFactory factory = new RollFactory();
        assertTrue("failure", factory instanceof RollFactory);
        System.out.println("test factory datatype...ok");
    }

    public void testBusinessCustomr () {

        BusinessCustomer customer = new BusinessCustomer("Allen");
        assertTrue("failure", customer instanceof BusinessCustomer);
        System.out.println("test customer datatype...ok");
        assertEquals("Allen", customer.getName());
        System.out.println("test customer.getName()...ok");
        int[] array1 = { 1, 2, 3, 4, 5};
        int[] array = customer.shuffleArray();

        Boolean bool = false;
        for (int i=0; i<5;i++) {
            if (array[i] != array1[i]) {
                bool = true;
            }
        }
        assertEquals(true, bool);
        System.out.println("test randomShuffleArray...ok");
    }

    public void testCounter () {

        Counter counter = new Counter();
        assertTrue("failure", counter instanceof Counter);
        System.out.println("test counter datatype...ok");

    }

    public void testPastryRoll  () {

        PastryRoll pastryRoll = new PastryRoll();
        assertEquals("Pastry Roll", pastryRoll.getName());
        System.out.println("test pastryRoll.getName()...ok");

    }


}
