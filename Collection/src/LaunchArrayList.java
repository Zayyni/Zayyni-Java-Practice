import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(44.6);
        al.add("Zayyni");
        al.add("Dev");
        al.add(true);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(100);
        al2.add(20);
        al2.add(0,45);
        al2.addAll(al);
        System.out.println(al2.contains("Zayyni"));
        System.out.println(al2.containsAll(al));

        System.out.println(al2);
    }
}
