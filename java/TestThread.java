public class TestThread {
    public static void main(String[] args) {
        MultiThreaded m1 = new MultiThreaded("first-thread");
        Thread t1 = new Thread(m1);
        t1.start();
        MultiThreaded m2 = new MultiThreaded("second-thread");
        MultiThreaded m3 = new MultiThreaded("third-thread");
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t2.start();
        t3.start();
    }
}
