import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFailSafe
{
    public static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(70);
        al.add(125);
        System.out.println(al);

        Iterator itr= al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
            al.add(44);

        }
    }

}
