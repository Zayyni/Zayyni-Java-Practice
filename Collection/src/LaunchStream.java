import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchStream
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        System.out.println(list);
//        Collections.sort(list); //affects original collection
//        System.out.println(list);

//        Stream<Integer> streamData1 = list.stream();
//        Stream<Integer> sortedData=streamData1.sorted();
//        Stream<Integer> streamData2=sortedData.map(n->n*2);
//        streamData2.forEach(n->System.out.println(n));

//        System.out.println(list);

        list.stream()
                .sorted()
                .map(n->n*2)
                .forEach(System.out::println);

//        String n = "ZAYYNI";
//        int lenght = n.toLowerCase()
//                .toUpperCase()
//                .concat("java")
//                .length();





        List<String> list1 = new ArrayList<>();
        list1.add("Zayyni");
        list1.add("Java");
        list1.add("Python");

        System.out.println(list1);

       Set<String> set= list1.stream()
                .collect(Collectors.toSet());


       List<String> list2=list1.stream()
               .sorted().collect(Collectors.toList());
       System.out.println(list2);







    }
}
