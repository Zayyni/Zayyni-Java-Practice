public class LaunchThreadDebugging2 implements Runnable
{
    public static void main(String[] args) {
        System.out.println("Main thread");
        Thread thread = new Thread(new LaunchThreadDebugging2());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Task of Thread");
    }
}
