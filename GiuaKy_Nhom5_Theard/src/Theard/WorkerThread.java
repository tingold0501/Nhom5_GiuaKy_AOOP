public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) Message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
