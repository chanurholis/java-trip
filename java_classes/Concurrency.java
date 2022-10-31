public class Concurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Concurrency thread = new Concurrency();
        thread.start();
        while (thread.isAlive()) {
            System.out.println("waiting ...");
        }
        
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }
}
