import java.io.IOException;

//class Parent{
//    public void work(){
//        System.out.println("Parent work");
//    }
//}
//class Child1 extends Parent{
//    public void work() throws ArithmeticException{
//        System.out.println("Child1 work");
//    }
//}
//class Child2 extends Parent{
//    public void work() throws IOException {
//        System.out.println("Child2 work");
//    }
//}


//class Parent{
//    public void work() throws ArithmeticException{
//        System.out.println("Parent work");
//    }
//}
//class Child1 extends Parent{
//    public void work() throws ArithmeticException{
//        System.out.println("Child1 work");
//    }
//}
//class Child2 extends Parent{
//    public void work() {
//        System.out.println("Child2 work");
//    }
//}
//
//class Child3 extends Parent{
//    public void work() throws IOException {
//        System.out.println("Child3 work");
//    }
//}

class Parent{
    public void work() throws IOException{
        System.out.println("Parent work");
    }
}
class Child1 extends Parent{
    public void work() throws ArithmeticException{
        System.out.println("Child1 work");
    }
}
class Child2 extends Parent{
    public void work() {
        System.out.println("Child2 work");
    }
}

class Child3 extends Parent{
    public void work() throws IOException {
        System.out.println("Child3 work");
    }
}
class Child4 extends Parent{
    public void work() throws Exception {
        System.out.println("Child4 work");
    }
}

public class LaunchExcept10 {
    public static void main(String[] args) {

    }
}
