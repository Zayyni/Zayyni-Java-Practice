class Mul{
    int mul(int x, int y){
        return x*y;
    }

//    void mul (int a, int b){
//        int res = a*b;
//    }

    double mul(int x, int y, double z){
        System.out.println("int int double");
        return x*y*z;
    }

    double mul(double x, double y, double z){
        System.out.println("double double double");
        return x*y*z;
    }
}
public class LaunchMo2 {
    public static void main(String[] args) {
        Mul m = new Mul();
        System.out.println(m.mul(10,20));
        System.out.println(m.mul(10,20,30.0));
        System.out.println(m.mul(10.0,20,30));
    }
}
