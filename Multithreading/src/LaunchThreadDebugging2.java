public class LaunchThreadDebugging2 implements Runnable
{
    public static void main(String[] args) {
        System.out.println("Main thread");
        Thread thread = new Thread(new LaunchThreadDebugging2());
        thread.start();

        Runnable r = ()->System.out.println("Task of thread 2");
        Thread thread2 = new Thread(r);
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println("Task of Thread");
    }
}
