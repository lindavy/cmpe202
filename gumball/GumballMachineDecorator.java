public class GumballMachineDecorator implements GumballMachine {
    protected static int num_gumballs = 10;
    protected static int price = 25;
    protected static int amount_inserted = 0;

    @Override
    public void insertCoin(int coin) {
        if (coin == 25)
        {
            amount_inserted += 25;
            System.out.println("Insert: " + coin);
        }
        else
        {
            System.out.println("Please insert only quarters! Ejecting coins...");
            amount_inserted = 0; 
        }
    }

    @Override
    public void turnCrank()
    {
        System.out.println("Amount Deposited: " + amount_inserted + '\n');
        if (num_gumballs > 0)
        {
            if (amount_inserted % price == 0)
            {
                System.out.println( "Thanks for your quarters.  Gumball(s) Ejected!" ) ;
            }
            else
            {
                System.out.println("Please insert " + price + " cents for 1 gumball. Ejecting coins..."); 
            }
            amount_inserted = 0; 
        }
        else
        {
            System.out.println( "No More Gumballs!  Sorry, can't return your coins." );
        }
    }
}
