public class Main {
    public static void main(String[] args)
    {
        System.out.println("Gumball Machine 1 - Quarters Only\n -------------------------------------");
        GumballMachineDecorator gmd = new GumballMachineDecorator();
        gmd.insertCoins(25);
        gmd.insertCoins(25);
        gmd.turnCrank();
    }
    
}
