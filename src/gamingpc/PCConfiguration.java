package gamingpc;

public abstract class PCConfiguration {

    protected CoolingSystem coolingSystem;

    public PCConfiguration(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public abstract void buildPC();

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
}
