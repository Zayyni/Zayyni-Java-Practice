import java.util.ArrayList;
import java.util.Iterator;

public class LaunchItr
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(70);
        al.add(125);
        System.out.println(al);

        Iterator itr= al.iterator();
        while (itr.hasNext()) // hasNext will check either data is available or not to avoid error
        {
            System.out.println(itr.next()); // then next will get the data
        }
    }
}
