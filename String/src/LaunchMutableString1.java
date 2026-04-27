public class LaunchMutableString1 {
    public static void main(String[] args) {

//        StringBuffer sb1 = new StringBuffer("Zayyni");
        StringBuilder sb1 = new StringBuilder("Zayyni");
        System.out.println(sb1);
        sb1.append(" Dev");
        System.out.println(sb1);
        sb1.append(533.56);
        sb1.append(true);
        System.out.println(sb1);

    }
}
