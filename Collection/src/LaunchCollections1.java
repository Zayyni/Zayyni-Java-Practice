import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections1
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Zayyni");
        list2.add("Zayn");
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
