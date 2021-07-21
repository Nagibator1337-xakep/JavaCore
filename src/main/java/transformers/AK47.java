package transformers;

public class AK47 implements IWeapon {
    private int ammo = 30;

    @Override
    public int ammo() {
        return ammo;
    }

    @Override
    public void fire() {
        System.out.print("AK-47 goes: tra");
        while (ammo !=0 ) {
            System.out.print("-ta");
            ammo--;
        }
        System.out.println("... click... click... click... \nOut of ammo, please reload!");
    }

    public void fire(int burst) {
        if (ammo - burst < 0) System.out.println("\nOut of ammo, please reload!");
        else {
            System.out.print("AK-47 goes: tra");
            int ammoTmp = ammo;
            while (ammo != ammoTmp - burst && ammoTmp - burst >= 0) {
                System.out.print("-ta");
                ammo--;
            }
        }
    }

    @Override
    public void reload() {
        ammo = 30;
        System.out.println("Reloaded");
    }
}
