package main;

import service.ICourse;

public class Zayyni
{
    private ICourse course;

    public Zayyni(ICourse course){
        this.course = course;
    }

    public Zayyni(){

    };

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public Boolean buyCourse(Double amount) {
        return course.getCourse(amount);
    }
}
