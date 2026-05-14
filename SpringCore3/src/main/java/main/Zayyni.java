package main;

import services.ICourse;

public class Zayyni {

    private ICourse course;

    public Zayyni(ICourse course) {
        System.out.println("Zayyni constructor");
        this.course = course;
    }

    public Zayyni() {
        super();
        System.out.println("Zayyni bean is created");
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public boolean buyTheCourse(Double amount) {
        return course.getTheCourse(amount);
    }

}
