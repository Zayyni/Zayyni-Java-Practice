package services;

public class Java implements ICourse {

    public Java()
    {
        System.out.println("Java bean is created");
    }

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java Course is purchased for " + amount);
        return true;
    }
}
