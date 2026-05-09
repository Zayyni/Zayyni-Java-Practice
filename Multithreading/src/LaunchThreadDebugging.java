
public class LaunchThreadDebugging extends Thread
{
    public LaunchThreadDebugging()
    {

    }
    public LaunchThreadDebugging(String name)
    {
        super(name);
    }
    public static void main(String[] args) {

        System.out.println("LaunchThreadDebugging started");
//        LaunchThreadDebugging thread = new LaunchThreadDebugging();
//        LaunchThreadDebugging thread2 = new LaunchThreadDebugging();
//        thread.setName("MyThread 1");
//        thread2.setName("MyThread 2");

        LaunchThreadDebugging thread = new LaunchThreadDebugging("MyThread1");
        LaunchThreadDebugging thread2 = new LaunchThreadDebugging("MyThread2");


        thread.start();
        thread2.start();
    }

    public void run()
    {
        System.out.println("Task for my threads is running");
    }
}
