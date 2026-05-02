import java.util.HashMap;
import java.util.HashSet;

class Zayyni{
    private Integer id;
    private String courseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Zayyni{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public Zayyni(Integer id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Zayyni() {
        super();
    }
}

public class LaunchMap1
{
    public static void main(String[] args) {
       HashMap hm1 =new HashMap<>();
       hm1.put(1, "Java");
       hm1.put(2, "Python");
       hm1.put(3, "C#");
       hm1.put(4, "PHP");
       hm1.put(5, "C++");
       System.out.println(hm1);

       Zayyni z = new Zayyni();
       z.setId(1);
       z.setCourseName("Java");

       HashMap hm2 = new HashMap();
       hm2.put(1, "Java");
       hm2.put(z, "Python"); // key-value

    }
}
