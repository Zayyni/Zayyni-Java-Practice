import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Criketer{
    int age;
    String name;
    double average;

    public Criketer(int age, String name, double average) {
        this.age = age;
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Criketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
// Three ways to implement an interface
// implements
// anonymous
// lambda

class Alphas implements Comparator<Criketer> {

    public int compare(Criketer c1, Criketer c2) {
        if (c1.average > c2.average) {
            return 1;
        }else
        {
            return -1;
        }
    }

}

public class LaunchComplexSorting1
{
    public static void main(String[] args) {

        Criketer criketer1 = new Criketer(25, "Zayn", 66.5);
        Criketer criketer2 = new Criketer(18, "Zya", 50.5);
        Criketer criketer3 = new Criketer(15, "Xohaib", 86.5);

        ArrayList<Criketer> list1 = new ArrayList<>();
        list1.add(criketer1);
        list1.add(criketer2);
        list1.add(criketer3);
        System.out.println(list1);
//        Collections.sort(list1);
//        Alphas alphas1 = new Alphas();
//        Collections.sort(list1, new Alphas());
//        Collections.sort(list1, alphas1);


        Comparator<Criketer> comparator= new Comparator<Criketer>() {

            public int compare(Criketer c1, Criketer c2) {
                if (c1.average > c2.average) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<Criketer> comparator1 = (Criketer c1, Criketer c2) -> {
            if (c1.average > c2.average) {
                return 1;
            } else {
                return -1;
            }
        };
        Collections.sort(list1, comparator1);
        System.out.println(list1);

    }
}
