package service;

public class SpringBoot implements ICourse {
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("SpringBoot course is " + amount);
        return true;
    }
}
