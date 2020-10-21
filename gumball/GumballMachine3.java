public class GumballMachine3 extends GumballMachineDecorator 
{    
    static
    {
        num_gumballs = 30; 
        price = 50;
    }

    @Override
    public void insertCoin(int coin)
    {
        if (coin == 25)
        {
            amount_inserted += 25;
            System.out.println("Inserted: " + coin);
        }
        else if (coin == 10)
        {
            amount_inserted += 10;
            System.out.println("Inserted: " + coin);
        }
        else if (coin == 5)
        {
            amount_inserted += 5;
            System.out.println("Inserted: " + coin);
        }
        else
        {
            System.out.println("Please insert dimes, nickels or quarters! Ejecting coins...");
            amount_inserted = 0; 
        }
    }
}
