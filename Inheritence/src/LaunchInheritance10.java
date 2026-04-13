class Animal{
   public void eat(){
       System.out.println("Animals are required to eat");
   }
}
class Tiger extends Animal{

}
public class LaunchInheritance10 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
