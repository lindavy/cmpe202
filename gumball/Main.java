public class Main {
    public static void main(String[] args)
    {
        // Gumball Machine 1 - Quarters only
        System.out.println("\tGumball Machine 1 - 25 Cents\n ---------------------------------------------------");
        GumballMachineDecorator gm1 = new GumballMachineDecorator();
        gm1.insertCoin(25);
        gm1.turnCrank();

        // Gumball Machine 2 - Quarters only
        System.out.println("\n\tGumball Machine 2 - 50 Cents, Quarters Only\n ---------------------------------------------------");
        GumballMachine2 gm2 = new GumballMachine2(); 
        gm2.insertCoin(25);
        gm2.insertCoin(25);
        gm2.turnCrank();

        // Gumball Machine 3 - Nickels, dimes, quarters only
        System.out.println("\n\tGumball Machine 3 - 50 Cents, All Coins\n ---------------------------------------------------");
        GumballMachine3 gm3 = new GumballMachine3(); 
        gm3.insertCoin(25); 
        gm3.insertCoin(10); 
        gm3.insertCoin(10); 
        gm3.insertCoin(5); 
        gm3.turnCrank(); 
    }
    
}
