package service;

public class SpringBoot implements ICourse {
    public Boolean getCourse(Double amount) {
        System.out.println("Course of SpringBoot is : "+ amount);
        return true;
    }
}
