package gamingpc;

public class AirCooling implements CoolingSystem {

    @Override
    public void cool() {
        System.out.println("Cooling with air fans.");
    }
}
