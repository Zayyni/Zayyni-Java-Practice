import java.util.ArrayDeque;

public class LaunchArrayDeque
{
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
//        ad.add(null);//not allowed null pointer exception
        System.out.println(ad);
    }
}
