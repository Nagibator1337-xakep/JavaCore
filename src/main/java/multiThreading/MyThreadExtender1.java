package multiThreading;

public class MyThreadExtender1 extends Thread {
    @Override
    public void run() {
        Thread myThread = new Thread(new SleepMessages());
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.start();

        System.out.println("Starting Thread Extended");
        for (int i=5;i>0;i--)
        {
            System.out.println("Running... "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Extended finished");
    }

}
