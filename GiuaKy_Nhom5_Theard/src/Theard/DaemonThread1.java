public class DaemonThread1 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Luong Hiem Hoat Dong");
        } else {
            System.out.println("Luong Nguoi Dung");
        }
    }
}
