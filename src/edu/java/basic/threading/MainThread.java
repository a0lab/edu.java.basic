package edu.java.basic.threading;

public class MainThread {
    public static void main(String[] args) {
        //Step 1 Constructing MyThread object
        MyThread mt = new MyThread("Child #1");

        //Step 2 Construct a thread from MyThread object
        Thread mainThread = new Thread(mt);

        // Finally start the thread
        mainThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread is ending");
    }
}
