package services;

public class SpringBoot implements ICourse {

    public SpringBoot() {
        System.out.println("SpringBoot bean is created");
    }
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring Boot course is purchased for " + amount);
        return true;
    }
}
