public class Program20  extends Thread {
    private volatile boolean running = true;

    public void run() {
        
            System.out.println("Thread is running...");
            while (running) {  
        }
        System.out.println("Thread stpped.");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args)throws InterruptedException {
        Program20 thread = new Program20();
        thread.start();

        Thread.sleep(2000);
        System.out.println("Stopping the thread...");

        thread.stopRunning(); // Signal the thread to stop
    }
    
    
}