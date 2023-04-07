public class MultiThreaded implements Runnable {
    String threadName;

    MultiThreaded(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running thread " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + " Printing: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " interrupted.");
        }
        System.out.println("Exiting thread: " + threadName);
    }
}
