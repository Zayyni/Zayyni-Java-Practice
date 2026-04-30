import java.util.ArrayList;

public class LaunchGen1
{
    public static void main(String[] args) {
        // typeSafety
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int data = arr[0];
        System.out.println(data);

        //typeSafety
        String []str = new String[3];
        str[0] = "Hello";
        str[1] = "World";
        str[2] = "Java";
        System.out.println(str[0]);

        //no typeSafety
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add(11);
        list.add(26.5);

        String info = (String) list.get(0);
        System.out.println(info);   // ClassCastException

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zayyni");
        list1.add("World");
        list1.add("Java");
        list1.add("Python");
        for (String str1 : list1) {
            System.out.println(str1);
        }



    }
}
