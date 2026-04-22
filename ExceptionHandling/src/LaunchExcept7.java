class Gamma{

    public int display(){
        try {
            System.out.println("Gamma display");
            return 1;
        }finally {
            System.out.println("Gamma display finally");
            return 0;
        }
    };
}

public class LaunchExcept7 {
    public static void main(String[] args) {
        Gamma gamma = new Gamma();
        System.out.println(gamma.display());
    }
}
