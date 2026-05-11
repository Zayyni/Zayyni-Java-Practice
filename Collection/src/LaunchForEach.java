import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LaunchForEach
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

//        for (Integer i:list){
//            int result=i*2;
//            System.out.println(result);
//        }
//        System.out.println(list);

//        Consumer<Integer> consumer= new Consumer<>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//
//            }
//        };

//        Consumer<Integer> consumer = (n)-> System.out.println(n);

        list.forEach((n)-> System.out.println(n));

    }
}
