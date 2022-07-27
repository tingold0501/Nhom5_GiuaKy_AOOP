public class ThreadGroupDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
