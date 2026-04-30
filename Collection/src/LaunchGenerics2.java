interface Alpha<T>{

}


class Generics<T> implements Alpha<String>
{
    private T ref;

    public Generics( T ref){
        this.ref = ref;
    }
    public void display(){
        System.out.println("The type of t is " + ref.getClass().getName());
    }

    public T getRef() {
        return ref;
    }
}
public class LaunchGenerics2
{
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>(3);
        g.display();
        System.out.println(g.getRef());

        Generics<String> g2 = new Generics<>("Zayyni");
        g2.display();
        System.out.println(g2.getRef());

    }
}
