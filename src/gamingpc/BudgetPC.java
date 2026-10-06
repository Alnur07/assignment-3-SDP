package gamingpc;

public class BudgetPC extends PCConfiguration{

    public BudgetPC(CoolingSystem coolingSystem) {
        super(coolingSystem);
    }

    @Override
    public void buildPC() {
        System.out.println("Building Budget Gaming PC.");
        System.out.println("Components: Intel Core i5, RTX5060, 16GB RAM.");
        coolingSystem.cool();
    }
}
