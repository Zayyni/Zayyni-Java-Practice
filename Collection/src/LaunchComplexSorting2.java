import java.util.ArrayList;
import java.util.Collections;

class Criketer1 implements Comparable<Criketer1> {
    int age;
    String name;
    double average;

    public Criketer1(int age, String name, double average) {
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

    @Override
    public int compareTo(Criketer1 o) {
        if (this.average > o.average) {
            return 1;
        }else
            return -1;

    }
}

public class LaunchComplexSorting2
{
    public static void main(String[] args) {

        Criketer1 criketer1 = new Criketer1(25, "Zayn", 66.5);
        Criketer1 criketer2 = new Criketer1(18, "Zya", 50.5);
        Criketer1 criketer3 = new Criketer1(15, "Xohaib", 86.5);

        ArrayList<Criketer1> list1 = new ArrayList<>();
        list1.add(criketer1);
        list1.add(criketer2);
        list1.add(criketer3);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
