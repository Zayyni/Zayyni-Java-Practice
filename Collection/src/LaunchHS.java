import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHS
{
    public static void main(String[] args) {
//        HashSet hs = new HashSet(); //it does not maintain order of insertion also it does not allow duplicates
//        hs.add(100);
//        hs.add(50);
//        hs.add(150);
//        hs.add(25);
//        hs.add(75);
//        hs.add(125);
//        hs.add(175);
//        System.out.println(hs);


        LinkedHashSet hs = new LinkedHashSet(); //it does maintain order of insertion also it does not allow duplicates
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);
        System.out.println(hs);

    }
}
