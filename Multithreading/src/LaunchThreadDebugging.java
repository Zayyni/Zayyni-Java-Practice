
public class LaunchThreadDebugging extends Thread
{
    public static void main(String[] args) {

        System.out.println("LaunchThreadDebugging started");
        LaunchThreadDebugging thread = new LaunchThreadDebugging();
        LaunchThreadDebugging thread2 = new LaunchThreadDebugging();
        thread.setName("MyThread 1");
        thread2.setName("MyThread 2");
        thread.start();
        thread2.start();
    }

    public void run()
    {
        System.out.println("Task for my threads is running");
    }
}
