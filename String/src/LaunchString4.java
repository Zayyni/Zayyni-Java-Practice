public class LaunchString4 {
    public static void main(String[] args) {

        String s1 = "zayyni dev java";
//        String[] str = s1.split("a");
        String[] str = s1.split(" ");
        System.out.println(str.length);
        for (String str1 : str) {
            System.out.print(str1);
        }
        System.out.println();

    }
}
