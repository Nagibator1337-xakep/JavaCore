package multiThreading;

public class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting Runnable Thread");
        for (int i=0;i<5;i++)
        {
            System.out.println("Running... "+(i+1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Runnable Thread finished");
    }
}
