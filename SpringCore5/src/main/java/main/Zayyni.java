package main;

import service.ICourse;

public class Zayyni {

    private ICourse course;

    public Zayyni(ICourse course) {
        System.out.println("Zayyni constructor");
        this.course = course;
    }

    public Zayyni() {
        super();
    }
    public void setCourse(ICourse course) {
        this.course = course;
    }

    public Boolean buyTheCourse(Double amount) {
        return course.getTheCourse(amount);
    }
}
