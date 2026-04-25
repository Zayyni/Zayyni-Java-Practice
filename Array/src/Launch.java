class Zayyni1{
    private String courseName;
    private int courseCost;
    private String city;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(int courseCost) {
        this.courseCost = courseCost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Zayyni1{" +
                "courseName='" + courseName + '\'' +
                ", courseCost=" + courseCost +
                ", city='" + city + '\'' +
                '}';
    }

    public Zayyni1(String courseName, int courseCost, String city) {
        super();
        this.courseName = courseName;
        this.courseCost = courseCost;
        this.city = city;
    }
    public Zayyni1(){
        super();
    }
}
public class Launch
{
    public static void main(String[] args)
    {
        Zayyni1 z1 = new Zayyni1("SB",344,"Lahore");
        System.out.println(z1);
//        System.out.println(z1.getCourseName());
//        System.out.println(z1.getCourseCost());
//        System.out.println(z1.getCity());


    }
}
