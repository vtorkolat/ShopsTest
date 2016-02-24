package main;

import threads.AuchanThread;
import threads.BillaThread;
import threads.FinishThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread billaThread = new BillaThread();
        Thread auchanThread = new AuchanThread();
        Thread finish = new FinishThreads();
        billaThread.start();
        Thread.sleep(10000);
        auchanThread.start();
        finish.start();
        finish.join();

    }
}
