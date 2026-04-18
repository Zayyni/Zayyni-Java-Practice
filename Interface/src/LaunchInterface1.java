interface Calc
{
    void add(int a, int b);//public abstract void add(int a, int b);
    void sub(int a, int b); //public abstract void sub(int a, int b);
}

class MyCalc1 implements Calc{

    public void add(int a, int b){
        int result = a+b;
        System.out.println("Result is " + result);
    }
    public void sub(int a, int b){
        int result = a-b;
        System.out.println("Result is " + result);
    }

}

class MyCalc2 implements Calc{
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

}

class MyCalc3 implements Calc{
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
    }

}

class Algebra{
    public void cal(Calc calc,int a, int b){
        calc.add(1,2);
        calc.sub(2,3);

    }
}

public class LaunchInterface1 {
    public static void main(String[] args) {

        MyCalc1 calc1= new MyCalc1();

        MyCalc2 calc2= new MyCalc2();

        MyCalc3 calc3 = new MyCalc3();

        Algebra algebra = new Algebra();
        algebra.cal(calc3,1,2);
        algebra.cal(calc1,2,3);
        algebra.cal(calc2,3,4);
    }
}
