public class GumballMachineDecorator implements GumballMachine {
    protected int num_gumballs = 100;
    protected int price = 25;
    protected static int amount_inserted = 0;

    @Override
    public void insertCoins(int coin) {
        if (coin == 25)
        {
            amount_inserted += 25;
            System.out.println("amount inserted: " + amount_inserted);
        }
        else
        {
            System.out.println("Please insert only quarters!");
        }
    }

    @Override
    public void turnCrank() {
        if (amount_inserted % 25 == 0)
        {
            amount_inserted = amount_inserted / 25;
            num_gumballs -= amount_inserted;
            System.out.println("Thanks for your coins. Ejected " + amount_inserted);
            System.out.println("Gumballs Left: " + num_gumballs);
            amount_inserted = 0;
        }

    }
}
