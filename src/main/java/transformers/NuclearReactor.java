package transformers;

public class NuclearReactor implements IPowerSupply {
    private int charge=100;

    @Override
    public int chargeLeft() {
        return charge;
    }

    @Override
    public void loadFuel() {
        charge = 100;
        System.out.println("Nuclear fuel loaded");
    }

    @Override
    public void charge() {
        this.loadFuel();
        System.out.println("Fully charged!");
    }

    @Override
    public void spendCharge(int spendCharge) {
        if(charge==0) System.out.println("Out of charge, please reload fuel");
        charge -= spendCharge;
        if (charge%10==0) System.out.println("Charge left: "+charge+"%");

    }
}