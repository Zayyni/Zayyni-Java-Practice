package sevices;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double salary;
    private String city;

    public Employee(Integer employeeId, String employeeName, Double salary, String city) {

        System.out.println("Employee Bean Created");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    public String employeeTask() {
        return "Every employee acts productive but in reality they are less productive";
    }
}
