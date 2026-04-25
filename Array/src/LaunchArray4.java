class Alien{
    int id;
    String name;
    String course;
}
public class LaunchArray4 {
    public static void main(String[] args) {

       Alien []arr = new Alien[3];
       arr[0] = new Alien();
       arr[1] = new Alien();
       arr[2] = new Alien();

//       for(int i = 0; i < arr.length; i++) {
//           arr[i] = new Alien();
//       }

        arr[0].id=0;
        arr[1].name="zayyni";
        arr[2].course="java";

        System.out.println(arr[0].id);
        System.out.println(arr[1].name);
        System.out.println(arr[2].course);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
