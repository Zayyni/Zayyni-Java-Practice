package service;

public class Java implements ICourse {
    public Boolean getCourse(Double amount) {
        System.out.println("Course of Java is : "+ amount);
        return true;
    }
}
