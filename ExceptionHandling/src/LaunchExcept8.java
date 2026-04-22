class Alien{
    public void alpha(){
        beta();
    };
    public void beta(){
        alpha();

    }
}

public class LaunchExcept8 {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.beta();
    }
}
