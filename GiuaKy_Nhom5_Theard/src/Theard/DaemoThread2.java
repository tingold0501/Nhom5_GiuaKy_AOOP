public class DaemoThread2 extends Thread {
    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Daemo: " + Thread.currentThread().isDaemon());
    }
}
