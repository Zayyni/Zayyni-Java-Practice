import java.util.ArrayList;
import java.util.List;

class Human{
    int age;

    public void display(){
        System.out.println("Human age is " + age);
    }
}
class Students extends Human{

}
class Employees
{

}
public class LaunchGenerics3
{
    public static void main(String[] args) {
//       Object obj= new Object();
//       String s = new String("Alien");
//       obj=s;
        //s=obj; //error or downcast

        Human h = new Human();

        Students s = new Students();
        h=s;

//        ArrayList<Human> hlist1 = new ArrayList<>();
//        ArrayList<Students> slist1 = new ArrayList<>();

//        hlist1=slist1; //compile time error

//        ArrayList<?> hlist1 = new ArrayList<>(); //? unknown type --> wildcard
//        ArrayList<Students> slist1 = new ArrayList<>();
//        hlist1=slist1; // it allowed as it is unknown

//        ArrayList<? extends Human> hlist3 = new ArrayList<>(); //upperbound like either Human type or Child of any human
//        ArrayList<Students> slist3 = new ArrayList<>();
//        ArrayList<Employees> elist1 = new ArrayList<>();
//        ArrayList<Object> olist1 = new ArrayList<>();
//        hlist3=slist3;
//        hlist3=elist1; // compile time error
//        hlist3=olist1; // compile time error as Object is parent of human


//        ArrayList<? super Human> hlist3 = new ArrayList<>(); //lowerbound --> either human or parent of human
//        ArrayList<Students> slist3 = new ArrayList<>();
//        ArrayList<Employees> elist1 = new ArrayList<>();
//        ArrayList<Object> olist1 = new ArrayList<>();

//        hlist3=elist1;// compile time error --> not parent of human or human
//        hlist3=elist1;//compile time error --> not parent of human or human
//        hlist3=olist1; //allowed as parent of human


//        ArrayList<Human> hlist = new ArrayList<>();
//        hlist.add(new Human());
//        hlist.add(new Human());
//        hlist.add(new Human());
//        invockDisplay(hlist);


        ArrayList<Students> slist = new ArrayList<>();
        slist.add(new Students());
        slist.add(new Students());
        slist.add(new Students());
        invockDisplay(slist);
    }
    public static void invockDisplay(List<? extends Human> list)
    {
     for(Human h:list){
         System.out.println(h);
//         h.display();
     }
    }
}
