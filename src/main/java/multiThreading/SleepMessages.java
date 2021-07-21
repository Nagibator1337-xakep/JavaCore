package multiThreading;

public class SleepMessages implements Runnable {

    @Override
    public void run() {
        String[] lullaby = {
                "Баю баюшки баю",
                "Не ложися на краю",
                "Придет серенький волчок",
                "И ухватит за бочок"
        };

        for (String s: lullaby) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }

    }
}
