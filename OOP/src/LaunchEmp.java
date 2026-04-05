class Employe {
    private int id;
    private String name;

    //setter
    void setId(int i){
        id=i;
    }

    void setName(String n){
        name=n;
    }

    //getter
    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

}
public class LaunchEmp {
    public static void main(String[] args) {

        Employe emp = new Employe();
        emp.setId(1);
        emp.setName("Zayyni");
        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}
