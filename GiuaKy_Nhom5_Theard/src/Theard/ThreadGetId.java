public class ThreadGetId extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
