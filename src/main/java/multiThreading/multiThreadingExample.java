package multiThreading;

public class multiThreadingExample {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread1());
        MyThread2 thread2 = new MyThread2();

        thread1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.setDaemon(true);
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                System.out.println("=== Runnable anonimous class "+threadName+" running!");
            }
        };

        Thread thread3 = new Thread(runnable);
        thread3.start();

        Runnable runnable1 = () -> {
            String threadName = Thread.currentThread().getName();
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("<<<<<< Running lambda "+threadName);
        };

        Thread thread4 = new Thread(runnable1,"MF Lambda Thread!");
        thread4.start();

        StoppableRunnable threadStoppableRunnable = new StoppableRunnable();
        Thread thread5 = new Thread(threadStoppableRunnable,"Stoppable-Runnable Thread");
        thread5.start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Requesting Stop...");
        threadStoppableRunnable.requestStop();
        System.out.println("Stop requested!");

    }
}
