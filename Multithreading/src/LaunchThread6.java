class MyCar implements Runnable
{
    @Override
    synchronized public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has entered into the car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has started to drive the car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has came back and now into the parking lot");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
public class LaunchThread6
{
    public static void main(String[] args) {
        MyCar car=new MyCar();
        Thread t1=new Thread(car);
        Thread t2=new Thread(car);
        Thread t3=new Thread(car);

        t1.setName("CHILD 1");
        t2.setName("CHILD 2");
        t3.setName("CHILD 3");
        t1.start();
        t2.start();
        t3.start();
    }
}

