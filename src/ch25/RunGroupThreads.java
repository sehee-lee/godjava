package ch25;

import ch25.SleepThread;

public class RunGroupThreads {
    public static void main(String args[]) {
        RunGroupThreads sample = new RunGroupThreads();
        sample.groupThread();
    }
    public void groupThread() {
        try {
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);

            ThreadGroup group = new ThreadGroup("Gorup1");
            Thread thread1 = new Thread(group, sleep1);
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Gorup name = " + group.getName());

            int actibeCount = group.activeCount();

            System.out.println("Active count = " + actibeCount);
            group.list();

            Thread[] tempThreadList = new Thread[actibeCount];
            int result = group.enumerate(tempThreadList);

            System.out.println("Enumerate result = " + result);
            for (Thread thread : tempThreadList) {
                System.out.println(thread);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
