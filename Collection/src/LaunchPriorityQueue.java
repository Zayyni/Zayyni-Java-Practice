import java.util.PriorityQueue;

public class LaunchPriorityQueue
{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(); //it follows min heap data structure
        pq.add(100);
        pq.add(80);
        pq.add(90);
        pq.add(70);
        pq.add(60);
        pq.add(40);
        pq.add(30);
        pq.add(20);
        pq.add(10);
//        pq.add(null);//not allowed null pointer exception

        System.out.println(pq);
    }
}
