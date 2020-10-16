import java.util.Random;

public class CustomerFactory{


    public static String nameDataSet() {

        String[] array = {"Lindsay Byrne",
                "Kymani Weston",
                "Alysha Clements",
                "Magnus Donovan",
                "Damian Manning",
                "Khushi Bishop",
                "Saffa Redman",
                "Peyton Allison",
                "Gwen Ruiz",
                "Baxter Villa",
                "Anwen Hayden",
                "Percy Solis",
                "Steven Holding",
                "Sharmin Livingston",
                "Zeynep Correa",
                "Tiana Olsen",
                "Adele Donaldson",
                "Glenn Acevedo",
                "Juniper Mclellan",
                "Wendy Cullen"};

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            String temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        int i = rand.nextInt(array.length);
        return array[i];
    }


    public Customer[] createCustomer()
    {
        Random rand = new Random();
        int numCasual = rand.nextInt(12) + 1;
        int numBusiness = rand.nextInt(3) + 1;
        int numCatering = rand.nextInt(3) + 1;
        int totalCustomer = numBusiness + numCasual + numCatering;

        Customer[] customersInOneDay = new Customer[totalCustomer];
        int index = 0;

        for(int i=0 ; i<numCasual ; i++)
        {
            customersInOneDay[index] = new CasualCustomer(nameDataSet());
            index++;
        }

        for(int i=0 ; i<numBusiness ; i++)
        {
            customersInOneDay[index] = new BusinessCustomer(nameDataSet());
            index++;
        }

        for(int i=0 ; i<numCatering ; i++)
        {
            customersInOneDay[index] = new CateringCustomer(nameDataSet());
            index++;
        }

        for(int i=0 ; i<customersInOneDay.length ; i++)
        {
            int randomIndexToSwap = rand.nextInt(customersInOneDay.length);
            Customer temp = customersInOneDay[randomIndexToSwap];
            customersInOneDay[randomIndexToSwap] = customersInOneDay[i];
            customersInOneDay[i] = temp;
        }

        return customersInOneDay;
    }
}