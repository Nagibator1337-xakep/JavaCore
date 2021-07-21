package transformers;

public interface IPowerSupply {
    int chargeLeft();
    void loadFuel();
    void charge();
    void spendCharge(int spendCharge);
}
