package gamingpc;

public class HighEndPC extends PCConfiguration {

    public HighEndPC(CoolingSystem coolingSystem) {
        super(coolingSystem);
    }

    @Override
    public void buildPC() {
        System.out.println("Building High-End Gaming PC.");
        System.out.println("Components: Intel Core Ultra 9, RTX 5090, 32GB RAM.");
        coolingSystem.cool();
    }
}
