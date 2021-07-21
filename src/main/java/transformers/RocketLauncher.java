package transformers;

public class RocketLauncher implements IWeapon {
    private int ammo = 1;

    @Override
    public int ammo() {
        return ammo;
    }

    @Override
    public void fire() {
        System.out.println("Rocket launcher goes: whoosh - BOOM!");
        ammo = 0;
        System.out.println("Reloading...");
        this.reload();
    }

    @Override
    public void reload() {
        ammo = 1;
        System.out.println("Reloaded");
    }
}