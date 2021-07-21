package transformers;

public class DieselGenerator implements IPowerSupply {
    private int fuel=100;

    @Override
    public int chargeLeft() {
        return fuel;
    }

    @Override
    public void loadFuel() {
        fuel = 100;
        System.out.println("Fuel tank filled up");
    }

    @Override
    public void charge() {
        System.out.println("Charging not necessary, fuel level at: "+fuel+"%");
    }

    @Override
    public void spendCharge(int spendCharge) {
        if(fuel==0) System.out.println("Out of fuel, please fill up the tank");
        fuel -= spendCharge;
        if (fuel%10==0) System.out.println("Fuel left: "+fuel+"%");
    }
}
