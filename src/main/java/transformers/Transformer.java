package transformers;

public class Transformer {
    IWeapon weaponSlotLeft;
    IWeapon weaponSlotRight;
    IPowerSupply powerSlot;
    IScanner scannerSlot;

    void installWeapon(IWeapon weaponLeft, IWeapon weaponRight) {
        this.weaponSlotLeft = weaponLeft;
        this.weaponSlotRight = weaponRight;
    }

    void installPower(IPowerSupply powerSupply) {
        this.powerSlot = powerSupply;
    }

    void installScanner(IScanner scanner) {
        this.scannerSlot = scanner;
    }

    void fireLeft() {
        this.weaponSlotLeft.fire();
        this.powerSlot.spendCharge(2);
    }
    void fireRight() {
        this.weaponSlotRight.fire();
        this.powerSlot.spendCharge(2);
    }
    void reloadLeft() {
        this.weaponSlotLeft.reload();
        this.powerSlot.spendCharge(4);
    }
    void reloadRight() {
        this.weaponSlotRight.reload();
        this.powerSlot.spendCharge(4);
    }
    void locateEnemies() {
        this.scannerSlot.locate();
        this.powerSlot.spendCharge(10);
    }
}