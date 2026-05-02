import java.util.*;

class Passport{
    private String name;
    private String city;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Passport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }
}
public class LaunchMap3
{
    public static void main(String[] args) {
        System.out.println("Passport Information Application");
        Passport passport1 = new Passport("Zayyni", "Lhr", "Pakistan");
        Passport passport2 = new Passport("Zayn", "Lhr", "Pakistan");
        Passport passport3 = new Passport("Xohaib", "Khr", "Pakistan");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(102);
        Integer id3 = Integer.valueOf(103);

        HashMap<Integer, Passport> map1 = new HashMap<>();
        map1.put(id1, passport1);
        map1.put(id2, passport2);
        map1.put(id3, passport3);
//        System.out.println(map1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the passport: ");
        Integer userPassport = sc.nextInt();

        Set entry =map1.entrySet();
        boolean flag = false;
        Iterator itr=entry.iterator();
        while (itr.hasNext())
        {
           Map.Entry keyValue= (Map.Entry) itr.next();
          Integer key= (Integer) keyValue.getKey();
          if (userPassport == key){
              System.out.println("Please find your passport details below ");
              System.out.println("Passport: " + keyValue.getValue());
              flag = true;
          }

        }
        if (flag == false){
            System.out.println("Passport details not found");
        }
    }
}
