import java.util.ArrayList;
class Employee{
    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

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

        ArrayList<String> list1 = new ArrayList<>(); //generics
        list1.add("Zayyni");
        list1.add("World");
        list1.add("Java");
        list1.add("Python");
        for (String str1 : list1) {
            System.out.println(str1);
        }

        System.out.println("***********************************");


        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(new Employee(1, "Zayyni", "Lhr"));
        list2.add(new Employee(2, "Zya", "Lhr"));
        list2.add(new Employee(3, "Xohaib", "Khi"));

        for (Employee employee : list2) {
            System.out.println(employee);
        }

        System.out.println("***********************************");

//        ArrayList<int> e = new ArrayList<int>(); //primitive is not allowed

//        ArrayList<Object> list3 = new ArrayList<Integer>(); //it is also not allowed like child on one side and parent on other side

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        System.out.println(list4);




    }
}
