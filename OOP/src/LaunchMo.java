class AdditionCalc{
    int add(int n1, int n2){
        return n1+n2;
    }

    int add (int n1, int n2, int n3){
        return n1+n2+n3;
    }

    double add (int n1, double n2){
        return n1+n2;
    }

    double add (double n1, double n2){
        return n1+n2;
    }

    double add (int n1, double n2, double n3){
        return n1+n2+n3;
    }

    double add (double n1, double n2, double n3){
        return n1+n2+n3;
    }
}

public class LaunchMo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        double a = 10.5;
        double b = 20.5;
        double c = 30.5;

        AdditionCalc cal = new AdditionCalc();
        System.out.println(cal.add(x,y,z));
        System.out.println(cal.add(a,b));


    }
}
