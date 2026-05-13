package service;

public class SpringBoot implements ICourse {
    @Override
    public Boolean learnJavaCourse(Double amount) {
        System.out.println("SpringBoot course amount: " + amount);
        return true;
    }
}
