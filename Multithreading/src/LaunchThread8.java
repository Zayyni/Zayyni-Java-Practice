class Library implements Runnable {

    String res1 = new String("Java");
    String res2 = new String("DSA");
    String res3 = new String("SpringBoot");

    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
            try {
                Thread.sleep(2000);
                synchronized(res1){
                    System.out.println("Student 1 has entered the library and acquired " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 1 has entered the library and acquired " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 1 has entered the library and acquired " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            try {
                Thread.sleep(2000);
                synchronized(res1){
                    System.out.println("Student 2 has entered the library and acquired " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 2 has entered the library and acquired " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 2 has entered the library and acquired " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class LaunchThread8
{
    public static void main(String[] args) {

        Library lib=new Library();
        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();
    }
}
