class Student{
    int id;
    String name;
    String city;

    static int count;

    {
        count++;
    }

    Student(){
        System.out.println("Initializing Student zero params Constructor");
    }

    Student(int id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }

}

public class LaunchStatic3 {
    public static void main(String[] args) {
        Student s = new Student(1,"Zayyni","Lahore");
        System.out.println("number of objects created "+ Student.count);

        Student s2 = new Student(2,"Zyya","Kamalia");
        System.out.println("number of objects created "+ Student.count);

        Student s3 = new Student(3,"Zohaib","Lahore");
        System.out.println("number of objects created "+ Student.count);

    }
}
