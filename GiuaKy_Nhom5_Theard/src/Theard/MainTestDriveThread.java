import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTestDriveThread {
    public static void main(String[] args) {
        // Multi t1 = new Multi();
        // t1.start();

        // Multi3 m3 = new Multi3();
        // Thread t1 = new Thread(m3);
        // t1.start();
        // ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();
        // Thread t1 = new Thread(threadGroupDemo);
        // t1.start();

        // SleepMethod1 sleepMethod1 = new SleepMethod1();
        // sleepMethod1.start();

        // SleepMethod1 sleepMethod2 = new SleepMethod1();
        // sleepMethod2.start();

        // SleepMethod2 sleepMethod2 = new SleepMethod2();
        // SleepMethod2 sleepMethod3 = new SleepMethod2();
        // sleepMethod2.start();
        // sleepMethod3.start();

        // ThreadTwice1 threadTwice1 = new ThreadTwice1();
        // threadTwice1.start();
        // threadTwice1.start();

        // CallRun1 callRun1 = new CallRun1();
        // callRun1.run();

        // CallRun2 callRun2 = new CallRun2();
        // CallRun2 callRun3 = new CallRun2();
        // callRun2.run();
        // callRun3.run();

        // MultiNaming1 multiNaming1 = new MultiNaming1();
        // MultiNaming1 multiNaming2 = new MultiNaming1();
        // System.out.println("Name Of Thread 1: " + multiNaming1.getName());
        // System.out.println("Name Of Thread 2: " + multiNaming2.getName());
        // multiNaming1.start();
        // multiNaming2.start();

        // multiNaming1.setName("Auto Find Image");
        // System.out.println("After Changing Name Of Thread 1" +
        // multiNaming1.getName());

        // MultiNaming2 multiNaming2 = new MultiNaming2();
        // MultiNaming2 multiNaming3 = new MultiNaming2();
        // multiNaming2.start();
        // multiNaming3.start();

        // MultiPrority1 multiPrority1 = new MultiPrority1();
        // MultiPrority1 multiPrority2 = new MultiPrority1();
        // multiPrority1.setPriority(Thread.MIN_PRIORITY);
        // multiPrority2.setPriority(Thread.MAX_PRIORITY);
        // multiPrority1.start();
        // multiPrority2.start();

        // ThreadGetId threadGetId = new ThreadGetId();
        // threadGetId.start();

        // DaemonThread1 daemonThread1 = new DaemonThread1();
        // DaemonThread1 daemonThread2 = new DaemonThread1();
        // DaemonThread1 daemonThread3 = new DaemonThread1();
        // daemonThread1.setDaemon(true);
        // daemonThread1.start();
        // daemonThread2.start();
        // daemonThread3.start();

        // DaemoThread2 daemoThread2 = new DaemoThread2();
        // DaemoThread2 daemoThread3 = new DaemoThread2();
        // daemoThread2.start();
        // daemoThread2.setDaemon(true);
        // daemoThread3.start();

        // ExecutorService executorService = Executors.newFixedThreadPool(5);
        // for (int i = 0; i < 10; i++) {
        // Runnable worker = new WorkerThread(" " + i);
        // executorService.execute(worker);
        // }
        // executorService.shutdown();
        // while (!executorService.isTerminated()) {

        // }
        // System.out.println("Finished all threads");

        // ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();
        // ThreadGroup threadGroup = new ThreadGroup("Parent ThreadGroup");
        // Thread thread1 = new Thread(threadGroup, threadGroupDemo, "One");
        // thread1.start();
        // Thread thread2 = new Thread(threadGroup, threadGroupDemo, "Two");
        // thread2.start();
        // Thread thread3 = new Thread(threadGroup, threadGroupDemo, "Three");
        // thread3.start();
        // System.out.println("Thread Group Name: " + threadGroup.getName());

        // Runtime runtime = Runtime.getRuntime();
        // runtime.addShutdownHook(new MyThread());
        // System.out.println("Now Main Sleeping.. Press Ctrl + C To Exit");
        // try {
        // Thread.sleep(3000);
        // } catch (Exception e) {

        // }

        // Runtime runtime = Runtime.getRuntime();
        // runtime.addShutdownHook(new Thread() {
        // public void run() {
        // System.out.println("Shut Down Hook Task Completed...");
        // }
        // });
        // System.out.println("Now Main Sleeping... Press Ctrl + C To Exit");
        // try {
        // Thread.sleep(3000);
        // } catch (Exception e) {
        // // TODO: handle exception
        // }

        // MultiTasking1 multiTasking1 = new MultiTasking1();
        // MultiTasking1 multiTasking2 = new MultiTasking1();
        // MultiTasking1 multiTasking3 = new MultiTasking1();
        // multiTasking1.start();
        // multiTasking2.start();
        // multiTasking3.start();

        // Thread thread1 = new Thread(new MultiTasking2());
        // Thread thread2 = new Thread(new MultiTasking2());
        // thread1.start();
        // thread2.start();

        // Simple1 simple1 = new Simple1();
        // Simple2 simple2 = new Simple2();
        // simple1.start();
        // simple2.start();

        // Thread thread = new Thread() {
        // public void run() {
        // System.out.println("Task One");
        // }
        // };
        // Thread thread1 = new Thread() {
        // public void run() {
        // System.out.println("Task Two");
        // }
        // };
        // thread.start();
        // thread1.start();

        // Runnable runnable = new Runnable() {
        // public void run() {
        // System.out.println("Task One");
        // }
        // };
        // Runnable runnable1 = new Runnable() {
        // public void run() {
        // System.out.println("Task Two");
        // }
        // };
        // Thread thread = new Thread(runnable);
        // Thread thread1 = new Thread(runnable1);
        // thread.start();
        // thread1.start();

    }
}
