public class GumballMachine2 extends GumballMachineDecorator{
    private int price = 50; 
    private int num_gumballs = 20; 
    private int eject_gumballs = 0; 

    @Override
    public void turnCrank() {
        eject_gumballs = amount_inserted / price; 

        if (eject_gumballs > 0)
        {
            if (num_gumballs > 0)
            {
                num_gumballs -= eject_gumballs;
                System.out.println("Thanks for your coins. Ejected " + eject_gumballs);
                System.out.println("Gumballs Left: " + num_gumballs);
                amount_inserted = 0;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." );
            }
        }
        else
        {
            System.out.println("Please insert the proper amount for the gumball."); 
        }

    }
}
