package threads;

public class FinishThreads extends Thread {

    @Override
    public  void run() {
        System.out.println("Threads finished");
    }

}
