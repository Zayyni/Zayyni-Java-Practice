class Dog{
    private int cost;
    private String name;
    private String color;

    public Dog(int cost, String name, String color) {
        this.cost = cost;
        this.name = name;
        this.color = color;
    }

    Dog (){
        cost = 0;
        name = null;
        color = null;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class LaunchConstructor {
    public static void main(String[] args) {

        Dog d= new Dog(3,"shero","black");
        System.out.println(d.getCost());
        System.out.println(d.getName());
        System.out.println(d.getColor());

        Dog d2= new Dog();
        System.out.println(d2.getCost());
        System.out.println(d2.getName());
        System.out.println(d2.getColor());

    }
}
