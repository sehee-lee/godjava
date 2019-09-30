package ch25;

public class RunDaemonThreads {
    public static void main(String args[]) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.checkThreadProperty();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("Thread1 id = " + thread1.getId());
        System.out.println("Thread2 id = " + thread2.getId());

        System.out.println("thread1 name = " + thread1.getName());
        System.out.println("thread2 name = " + thread2.getName());

        System.out.println("thread1 priority = " + thread1.getPriority());

        daemonThread.setDaemon(true);
        System.out.println("Thread1 is Daemon = " + thread1.isDaemon());
        System.out.println("daemonThread is Daemon = " + daemonThread.isDaemon());
    }
}