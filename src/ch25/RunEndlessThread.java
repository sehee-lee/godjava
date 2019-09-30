package ch25;

public class RunEndlessThread {
    public static void main(String args[]) {
        RunEndlessThread sample = new RunEndlessThread();
        sample.runDeamonThread();
//        sample.endless();
    }
    public void endless() {
        EndlessThread thread = new EndlessThread();
        thread.start();
    }
    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.start();
    }
    public void runDeamonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}