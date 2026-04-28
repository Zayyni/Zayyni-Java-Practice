import java.util.LinkedList;

public class LaunchLinkedList
{
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add("Java");
        ll1.add("Lahore");
        ll1.add(20);
        System.out.println(ll1);
        ll1.addFirst(44);
        ll1.addLast(55);
        ll1.add(0,"Zayyni");
        System.out.println(ll1);
        ll1.offer("SpringBoot");
        System.out.println(ll1);
        ll1.offer("Junit5");
        System.out.println(ll1);
        ll1.offerFirst("Spring");
        System.out.println(ll1);
        System.out.println(ll1.peek());




    }
}
