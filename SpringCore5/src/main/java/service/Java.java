package service;

public class Java implements ICourse {
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java course is " + amount);
        return true;
    }
}
