class Alpha2{
    int a,b;
    public Alpha2(){
        a=10;
        b=20;
        System.out.println("Alpha Zero params constructor");
    }

    public Alpha2(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Alpha Params constructor");
    }

}
class Beta2 extends Alpha2{
    int x, y;
    public Beta2(){
        this(3,4);
        x=1;
        y=2;
        System.out.println("Beta Zero params constructor");
    }
    public Beta2(int x, int y){
        super(4,33);
        this.x = x;
        this.y = y;
        System.out.println("Beta Params constructor");
    }

    public void display(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
public class LaunchInheritance8
{
    public static void main(String[] args) {
        Beta2 b = new Beta2(4,5);
        b.display();
        Beta2 b1 = new Beta2();
        b1.display();
    }
}
