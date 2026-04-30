import java.nio.file.Paths;
import java.util.*;

public class LaunchExampleList
{
    public static void main(String[] args) {
       List<Integer> list= new ArrayList<>();

//        List<Integer> Llist= new LinkedList<>();

        List<Integer> l =Arrays.asList(1,2,3,4,5,6,7,8,9); //using arrays class we can also create collection

    }

    public static Iterable<Integer> getIntegers()
    {
//        return new ArrayList<Integer>();
        return new TreeSet<Integer>();
    }

    public static List<Integer> getInteger()
    {
        return new ArrayList<Integer>();
//        return new TreeSet<Integer>(); // not allowed
    }
}
