package service;

public class Zayyni
{

    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public Boolean buyJavaCourse(Double amount)
    {
        return course.learnJavaCourse(amount);
    }
}
