public class ThreadImplementRunnable implements Runnable {
    public static int number = 0;

    public static void main(String[] args) {
        ThreadImplementRunnable myObj = new ThreadImplementRunnable();
        Thread thread = new Thread(myObj);
        thread.start();
        System.out.println(number);
        number++;
        System.out.println(number);
        System.out.println("This code is outside of the thread!");
    }

    // must implement this method bz implement runnable
    public void run() {
        number++;
        System.out.println("This code is running in a thread!");
    }
}
