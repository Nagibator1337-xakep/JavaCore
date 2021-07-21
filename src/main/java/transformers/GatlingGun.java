package transformers;

public class GatlingGun implements IWeapon {
    private int ammo = 100;
    private int ammoCache = ammo;

    public GatlingGun(int ammo) {
        this.ammoCache = ammo;
        this.ammo = ammo;
    }

    public GatlingGun() {
    }

    @Override
    public int ammo() {
        return ammo;
    }

    @Override
    public void fire() {
        System.out.print("Gatling Gun goes: brrr");
        while (ammo != 0) {
            System.out.print("r");
            ammo--;
        }
        System.out.println(" psssss... \nOut of ammo, please reload!");
    }

    public void fire(int burst) {
        if (ammo - burst < 0) System.out.println("Out of ammo, please reload!");
        else {
            System.out.print("Gatling Gun goes: brrr");
            int ammoTmp = ammo;
            while (ammo != ammoTmp - burst && ammoTmp - burst >= 0) {
                System.out.print("r");
                ammo--;
            }
            System.out.println(" psssss...");
        }
    }

    @Override
    public void reload() {
        ammo = ammoCache;
        System.out.println("Reloaded");
    }
}
