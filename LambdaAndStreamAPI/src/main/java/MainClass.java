import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
//        Older way
//        Walkable obj = new WalkFast();
//        obj.walk(4);

//        Walkable obj = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 0;
//            }
//        };

//        Walkable obj = ( steps,isEnabled) -> {
//            System.out.println("Walking steps "+steps);
//            return 2*steps;
//        };
//        obj.walk(4,true);
//
//
//        Walkable obj2 = (steps, isEnabled) -> 2*steps;
//


        List<String> fruits = List.of("apple", "orange", "banana", "mango");


        Map<String,Integer> fruitsList = fruits
                .stream()
//                .map(fruit -> fruit.length())
                .collect(Collectors.toMap(
                        fruit -> fruit,
                        fruit -> fruit.length()
                ));

        System.out.println(fruitsList);

//        Stream<String> stream = fruits.stream();
//        stream.forEach((fruit -> System.out.println(fruit)));

//        stream
//                .filter(fruit -> fruit.length() < 8 )
//                .sorted()
//                .map(fruit -> fruit.length())
//                .map(fruitLength -> 2*fruitLength)
//                .forEach(fruit -> System.out.println(fruit));
    }
}

@FunctionalInterface
interface Walkable{
    int walk(int steps, boolean isEnabled);
}

//class WalkFast implements Walkable{
//
//    public int walk(int steps) {
//        System.out.println("Walking number of steps "+steps);
//        return 2*steps;
//    }
//}
