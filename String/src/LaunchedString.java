import java.util.Locale;

public class LaunchedString {
    public static void main(String[] args) {
        String s = "ZayyniDev";
        System.out.println(s.length());
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.toLowerCase(Locale.ROOT));
        System.out.println(s.toCharArray());
        System.out.println(s.substring(0,6));
        System.out.println(s.substring(6));
    }
}
