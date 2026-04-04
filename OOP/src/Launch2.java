class Calculator{
    int num1;
    int num2;

    void add(){
        num1 = 10;
        num2 = 20;

        int result = num1 + num2;
        System.out.println(result);
    }
}

public class Launch2 {
    public static void main(String[] args) {
       Calculator c = new Calculator();
       c.add();

       for (int i=0;i<4;i++){
           System.out.println(i);
       }

    }


}
