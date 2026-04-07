class Demo{
    int num1,num2;

    Demo(){
        super();
        System.out.println("Zero Params Constructor called");
    }
    Demo(int num1,int num2){
        this(num1);
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Two Params Constructor called");
    }
    Demo(int num1){
        this();
        this.num1 = num1;
        num2=44;
        System.out.println("One Params Constructor called");
    }
    void display(){
        System.out.println(num1);
        System.out.println(num2);

    }
}
public class LaunchConstructor2 {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        d1.display();
        System.out.println("************************************");

        Demo d2 = new Demo(4,5);
        d2.display();
    }
}
