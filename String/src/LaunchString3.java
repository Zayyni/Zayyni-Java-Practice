public class LaunchString3 {
    public static void main(String[] args) {
//        final String s1 = "Zayyni";
//        s1=s1 + "Dev";

//        final String s1 = "Zayyni";
//        String s2 = s1 + " Dev";
//        System.out.println(s2);

        //CompareTo() -> compares the values of String lexiographically (ascii code)
        String s1 = "zayyni";
        String s2 = "zya";
        int result = s1.compareTo(s2);
        System.out.println(result);
        //it always gives difference of first character

        if(result == 0)
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }




    }
}
