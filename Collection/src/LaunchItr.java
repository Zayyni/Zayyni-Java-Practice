import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

//        Iterator itr = al.iterator(); //it is a cursor which is available at the doorstep of our collection
//        while (itr.hasNext()) // hasNext will check either data is available or not to avoid error
//        {
//            System.out.println(itr.next()); // then next will get the data
//        }

//        ListIterator litr = al.listIterator();
//        while (litr.hasNext()) // it will check the next
//        {
//            System.out.println(litr.next());
//        }

        ListIterator litr = al.listIterator(al.size());
        while (litr.hasPrevious()) //it will check the previous
        {
            System.out.println(litr.previous());
        }
    }
}
