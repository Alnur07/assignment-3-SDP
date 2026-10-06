package gamingpc;

public class Main {

    public static void main(String[] args) {

        PCConfiguration budgetPC = new BudgetPC(new AirCooling());
        budgetPC.buildPC();

        System.out.println();

        PCConfiguration highEndPC = new HighEndPC(new LiquidCooling());
        highEndPC.buildPC();

        System.out.println();

        budgetPC.setCoolingSystem(new LiquidCooling());

        System.out.println("Switching cooling system...");
        budgetPC.buildPC();
    }
}
