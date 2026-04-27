public class LaunchMutableString2 {
    public static void main(String[] args) {
//        StringBuffer sb1 = new StringBuffer("Zayyni"); //16 original capacity + 6 =22
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        sb1.append("Zayyni");
        sb1.trimToSize();
//        sb1.append("Zyaa");
//        sb1.append("java developer");
//        System.out.println(sb1);
//        System.out.println(sb1.capacity()); //16*2+2 = 34
//
//        //35  or 32*2+2 = 70




    }
}
