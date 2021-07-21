package transformers;

public class LiIonBattery implements IPowerSupply {
    private int charge=100;

    @Override
    public int chargeLeft() {
        return charge;
    }

    @Override
    public void loadFuel() {
        charge = 10;
        System.out.println("New battery installed, Charge needed. Current charge at 10%");
    }

    @Override
    public void charge() {
        this.charge = 100;
        System.out.println("Fully charged!");
    }

    @Override
    public void spendCharge(int spendCharge) {
        if(charge==0) System.out.println("Out of charge, please charge battery");
        charge -= spendCharge;
        if (charge%10==0) System.out.println("Charge left: "+charge+"%");
    }
}
