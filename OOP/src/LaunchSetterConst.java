class Finishers{
    private int id;
    private String name;
    private String city;

    public Finishers(){
        super();
    }
    public Finishers(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


public class LaunchSetterConst {
    public static void main(String[] args) {
        Finishers f1 = new Finishers(1,"Zayyni","Gwalior");
        System.out.println(f1.getId());
        System.out.println(f1.getName());
        System.out.println(f1.getCity());

        Finishers f2 = new Finishers();
        f2.setId(2);
        f2.setName("Zayyni");
        f2.setCity("Gwalior");

        System.out.println(f2.getId());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());
    }
}
