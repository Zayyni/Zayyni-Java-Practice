class Producer extends Thread
{
    Queue q;
    int i =1;
    public Producer(Queue q)
    {
        this.q = q;
    }
    @Override
    public void run()
    {
        while(true)
        {
            q.produce(i++);
        }
    }
}
class Consumer extends Thread
{
Queue q;
public Consumer(Queue q)
{
    this.q = q;

}
    @Override
    public void run()
    {
        while(true)
        {
            q.consume();
        }
    }

}
class Queue
{
    int data;
    boolean flag = false;
    synchronized public void produce(int i) {
        try {
            if (flag == true) {
                System.out.println(Thread.currentThread().getName() + ": Waiting for data");
                wait();
            }
            else {
                data = i;
                System.out.println("Producer " + i + " produced " + data);
                flag = true;
                notify();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void consume()
    {
        try {
            if (flag == false) {
                System.out.println(Thread.currentThread().getName() + ": Waiting for data");    
                wait();
            }
            else {
                System.out.println("Consumer " + data + " consumed");
                flag = false;
                notify();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class LaunchInterThread1
{
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}
