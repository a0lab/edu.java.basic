package edu.java.basic.threading;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        //Step 1 Constructing MyThread object
        MyThread mt = MyThread.createAndStart ("Child #1");

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
