import java.util.ArrayList;
import java.util.Iterator;

public class LaunchAccessingData
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(70);
        al.add(125);
        System.out.println(al);

//        double d = (double) al.get(2);
//        System.out.println(d);

//        for (int i = 0; i < al.size(); i++)
//        {
//            System.out.println(al.get(i));
//        }

//        for (Object ob:al)
//        {
//            System.out.println(ob);
//        }

//        for (int i = 0; i < al.size(); i++)
//        {
//            Integer data = (Integer) al.get(i);
//            System.out.println(data);
//            al.add(12); // loops are not recommend as they are not suitable for concurrent changes
//
//        }
        Iterator itr= al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
            al.add(44);
            
        }
    }
}
