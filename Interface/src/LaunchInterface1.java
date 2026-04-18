interface Calc
{
    void add(int a, int b);//public abstract void add(int a, int b);
    void sub(int a, int b); //public abstract void sub(int a, int b);
}

interface Calc2{
    int mul(int a , int b);
    int div(int a , int b);
}

class Calcultor{
    public void display(){
        System.out.println("Calculator class");
    }
}

class MyCalc1 extends Calcultor implements Calc,Calc2{

    public void add(int a, int b){
        int result = a+b;
        System.out.println("Result is " + result);
    }
    public void sub(int a, int b){
        int result = a-b;
        System.out.println("Result is " + result);
    }


    public int mul(int a, int b) {
        return a*b;
    }


    public int div(int a, int b) {
        return a/b;
    }
}

class MyCalc2 implements Calc,Calc2{
    public void add(int a, int b){
        int n1 =a;
        int n2 = b;
        int result = n1+n2;
        System.out.println("Result is " + result);
    }
    public void sub(int a, int b){
        int n1 =a;
        int n2 = b;
        int result = n1-n2;
        System.out.println("Result is " + result);
    }


    public int mul(int a, int b) {
        return a*b;
    }


    public int div(int a, int b) {
        return a/b;
    }
}

class MyCalc3 implements Calc,Calc2{
    public void add(int a, int b){
        if (a>0 && b>0){
            int result = a+b;
            System.out.println("Result is " + result);
        }
    }
    public void sub(int a, int b){
        if (a>0 && b>0){
            int result = a-b;
            System.out.println("Result is " + result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public int mul(int a, int b) {
        if (a>0 && b>0){
            int result = a*b;
            System.out.println("Result is " + result);
            return result;
        }
        else {
            System.out.println("Invalid Input");
            return 0;
        }
    }


    public int div(int a, int b) {
        if (a>0 && b>0){
            int result = a/b;
            System.out.println("Result is " + result);
            return result;
        }
        else {
            System.out.println("Invalid Input");
            return 0;
        }
    }
}

//class Algebra{
//    public void cal(Calc calc,int a, int b){
//        calc.add(1,2);
//        calc.sub(2,3);
//
//    }
//}

public class LaunchInterface1 {
    public static void main(String[] args) {

//        MyCalc1 calc1= new MyCalc1();
//
//        MyCalc2 calc2= new MyCalc2();
//
//        MyCalc3 calc3 = new MyCalc3();
//
//        Algebra algebra = new Algebra();
//        algebra.cal(calc3,1,2);
//        algebra.cal(calc1,2,3);
//        algebra.cal(calc2,3,4);


        MyCalc1 calc1= new MyCalc1();
        calc1.add(1,2);
        calc1.sub(2,3);
        calc1.mul(3,4);
        calc1.div(4,5);

        MyCalc2 calc2= new MyCalc2();
        calc2.add(1,2);
        calc2.sub(2,3);
        calc2.mul(3,4);
        calc2.div(4,5);

        MyCalc3 calc3 = new MyCalc3();
        calc3.add(1,2);
        calc3.sub(2,3);
        calc3.mul(3,4);
        calc3.div(4,5);
    }
}
