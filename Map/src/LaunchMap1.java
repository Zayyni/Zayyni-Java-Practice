import java.util.*;

class Zayyni{
    private Integer id;
    private String courseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Zayyni{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public Zayyni(Integer id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Zayyni() {
        super();
    }
}

public class LaunchMap1
{
    public static void main(String[] args) {
       HashMap hm1 =new HashMap<>();
       hm1.put(1, "Java");
       hm1.put(2, "Python");
       hm1.put(3, "C#");
       hm1.put(4, "PHP");
       hm1.put(5, "C++");
       System.out.println(hm1);

       System.out.println("*****************************************");

       Zayyni z = new Zayyni();
       z.setId(1);
       z.setCourseName("Java");

//       HashMap hm2 = new HashMap(); //No order of insertion is maintained
//       hm2.put(1, "Java");
//       hm2.put(z, "Python"); // key-value
//
//        hm2.put(2, "MicroServices");
////        hm2.put(3, "MicroServices"); //key must be unique and value need not to be unique
//        hm2.put(3, "MicroServices");
//        hm2.put(null, "C#"); //key can be null only with respect to HashMap
//        hm2.put(4, null);// value can also be null
//
//        System.out.println(hm2);

//        LinkedHashMap lhm2 = new LinkedHashMap(); //No order of insertion is maintained also
//        // linkedHashMap() is a child class of HashMap();
//        lhm2.put(1, "Java");
//        lhm2.put(z, "Python"); // key-value
//
//        lhm2.put(2, "MicroServices");
////        hm2.put(3, "MicroServices"); //key must be unique and value need not to be unique
//        lhm2.put(3, "MicroServices");
//        lhm2.put(null, "C#"); //key can be null only with respect to HashMap
//        lhm2.put(4, null);// value can also be null
//
//        System.out.println(lhm2);

//        HashMap<Integer,String> hm2 = new HashMap<>(); //key must be of integer type
//        hm2.put(1, "Java"); //Entry
////        hm2.put(z, "Python"); // key-value
//
//        hm2.put(2, "MicroServices");
//
//        System.out.println(hm2);

//        Hashtable ht = new Hashtable();
//        ht.put(1, "Java");
//        ht.put(2, "Python");
////        ht.put(null, "SpringBoot"); // null key is not allowed in Hashtable
////        ht.put(3, null); //null value is not allowed in Hashtable
//        System.out.println(ht);


        TreeMap tm = new TreeMap(); // it return list in the sorted order on the base or keys
        tm.put(2, "Java");
        tm.put(1, "Python");
        tm.put(3, "C#");
//        tm.put(null, "PHP");// key cannot be null
        tm.put(4,null);

        System.out.println(tm);



    }
}
