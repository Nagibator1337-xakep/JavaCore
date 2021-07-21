package transformers;

public class App {
    public static void main(String[] args) {
/*        GatlingGun leftGun = new GatlingGun(500);
        leftGun.fire(40);
        leftGun.fire(40);
        leftGun.fire(40);
        leftGun.reload();
        System.out.println(leftGun.ammo());
        leftGun.fire(40);
        leftGun.fire(40);
        leftGun.fire(40);
        System.out.println(leftGun.ammo());

        AK47 rightGun = new AK47();
        rightGun.fire(20);
        rightGun.fire(20);*/

        Transformer optimus = new Transformer();
        GatlingGun leftGun = new GatlingGun(200);
        RocketLauncher rightGun = new RocketLauncher();
        DieselGenerator dieselGenerator = new DieselGenerator();
        Radar radar = new Radar();

        optimus.installPower(dieselGenerator);
        optimus.installWeapon(leftGun,rightGun);
        optimus.installScanner(radar);

        System.out.println(optimus.powerSlot.chargeLeft());
        optimus.locateEnemies();
        Lidar lidar = new Lidar();
        optimus.installScanner(lidar);
        optimus.locateEnemies();
    }
}
