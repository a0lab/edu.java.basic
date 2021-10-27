package edu.java.basic.threading;

// Creating thread by implementing runnable interface
public class MyThread implements Runnable{
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    // Entry point for thread
    public void run() {
        System.out.println(threadName + " starting...");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }
        } catch (InterruptedException ex) {
            System.out.println("Interrupted thread:" + threadName);
        }
        System.out.println("Terminating thread: " + threadName);
    }
}
