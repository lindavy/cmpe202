public class Main {
    public static void main(String[] args)
    {
        // Gumball Machine 1
        System.out.println("Gumball Machine 1 - 25 Cents\n -------------------------------------");
        GumballMachineDecorator gmd = new GumballMachineDecorator();
        gmd.insertCoins(25);
        gmd.insertCoins(25);
        gmd.turnCrank();

        // Gumball Machine 2
        System.out.println("\nGumball Machine 2 - 50 Cents\n -------------------------------------");
        GumballMachine2 gm2 = new GumballMachine2(); 
        gm2.insertCoins(25);
        gm2.insertCoins(25);
        gm2.insertCoins(25);
        gm2.turnCrank();
        // Gumball Machine 3
    }
    
}
