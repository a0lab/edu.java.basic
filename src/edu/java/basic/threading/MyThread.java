package edu.java.basic.threading;

// Creating thread by implementing runnable interface
public class MyThread implements Runnable{
    Thread thread;

    MyThread(String name) {
        thread = new Thread(this, name);
    }

    // A factory method that creates and starts the thread
    public static MyThread createAndStart(String name) {
        MyThread myThread = new MyThread(name);
        myThread.thread.start();
        return myThread;
    }

    // Entry point for thread
    public void run() {
        System.out.println(thread.getName() + " starting...");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        } catch (InterruptedException ex) {
            System.out.println("Interrupted thread:" + thread.getName());
        }
        System.out.println("Terminating thread: " + thread.getName());
    }
}
