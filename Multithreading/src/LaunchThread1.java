public class LaunchThread1
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started ..................");

        //Thread.sleep(6000);
        Thread thread=Thread.currentThread();
        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread ID: "+thread.getId());
        System.out.println("Thread Priority: "+thread.getPriority());
        Thread.sleep(4000);
        thread.setName("Zayyni");
        thread.setPriority(4);
        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread Priority: "+thread.getPriority());
        System.out.println("Application Terminated ................");
    }
}
