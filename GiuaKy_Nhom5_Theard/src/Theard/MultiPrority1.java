public class MultiPrority1 extends Thread {
    public void run() {
        System.out.println("Running Thread Name Is: " + Thread.currentThread().getName());
        System.out.println("Running Thread Priority Is: " + Thread.currentThread().getPriority());
    }
}
