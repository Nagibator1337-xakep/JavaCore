package multiThreading;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 15; i > 0; i--) {

            try {
                Thread.sleep(1000);
                System.out.println("---Running "+threadName+": "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
