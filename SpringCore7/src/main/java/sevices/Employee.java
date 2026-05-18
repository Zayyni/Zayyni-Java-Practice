package sevices;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double salary;
    private String city;

    private Department department;

    public Employee(Integer employeeId, String employeeName, Double salary, String city, Department department) {

        System.out.println("Employee Bean Created");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.city = city;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", department=" + department +
                '}';
    }

    public Employee()
    {
        super();
        System.out.println("Employee Bean Created");
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String employeeTask() {
        return "Every employee acts productive but in reality they are less productive";
    }
}
