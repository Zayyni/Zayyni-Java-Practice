class Alien{
    static {
        System.out.println("SB1");
    }
    static {
        System.out.println("SB2");
    }
    {
        System.out.println("NSB1");
    }
    {
        System.out.println("NSB2");
    }
}
public class LaunchStatic4 {
    public static void main(String[] args) {
        Alien a = new Alien();
        Alien b = new Alien();
        Alien c = new Alien();
    }
}
