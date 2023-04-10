package Employee_App.Com_HR_Personnel;
import java.time.LocalDate;


public class Employee {
    private String employeeName;
    private LocalDate hireDate;
    private String position;

    public Employee() {

    }

    //public Employee(String employeeName, LocalDate hireDate, String position) {
        //this.employeeName = employeeName;
       // this.hireDate = hireDate;
        //this.position = position;
    //}
    public String getEmployeeInfo() {
        String result = "";

        result += "Employee Name: " + employeeName + "\n";
        result += "Date Hired: " + hireDate + "\n";
        result += "Position: " + position + "\n";
        return result;

    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberOfYearsWorkedSinceHired(){
        String result = "";
       int currentYear = 2023;
       int yearHired = getHireDate().getYear();
       result += (currentYear - yearHired);
        return Integer.parseInt(result);

    }

}

