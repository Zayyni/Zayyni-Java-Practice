class Student {
    String name;
    int age;
    int id;

    void studying(){
        System.out.println("Student is studying");
    }

    void playing(){
        System.out.println("Student is playing");
    }
}


public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.studying();
        st.playing();
        System.out.println("Hello, World!");
    }

}