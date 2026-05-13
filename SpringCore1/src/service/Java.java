package service;

public class Java implements ICourse {
    @Override
    public Boolean learnJavaCourse(Double amount) {
        System.out.println("Java course amount: " + amount);
        return true;
    }
}
