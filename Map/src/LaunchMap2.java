import java.util.*;

interface Alpha{
    interface Beta{
        static void display(){
            System.out.println("Static method of an inner interface");
        }
    }
}

public class LaunchMap2
{
    public static void main(String[] args) {
//         Alpha.Beta.display();

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Java"); //Entry  ---> Map
        map.put(2, "Python");
        map.put(3, "C#");
        System.out.println(map);
        String data = map.get(1);
        System.out.println(data);
        System.out.println("***************************");

        Collection<String> values =map.values();
        Iterator<String> itr =values.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("***************************");
        Set<Integer> keys =map.keySet();
        Iterator<Integer> key=keys.iterator();
        while (key.hasNext()) {
            System.out.println(key.next());
        }

        System.out.println("***************************");

        Set entry=map.entrySet();
        Iterator entries=entry.iterator();
        while (entries.hasNext()) {
//            System.out.println(entries.next());
            Map.Entry pair= (Map.Entry) entries.next();
            System.out.println("Key : " + pair.getKey()+ " Value : "+pair.getValue());
        }


    }
}
