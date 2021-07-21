package multiThreading;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Running "+threadName+": "+(i+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
