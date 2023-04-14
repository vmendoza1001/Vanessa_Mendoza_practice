package Employee_App.Com_HR_Personnel;

import java.time.LocalDate;


public class Employee {
    private String employeeName;
    private LocalDate hireDate;
    private String position;

    public Employee() {

    }

    public Employee(String employeeName, LocalDate hireDate, String position) {
        this.employeeName = employeeName;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getEmployeeInfo() {
        return

                "Employee Name: " + this.employeeName + "\n" +
                        "Date Hired: " + this.hireDate + "\n" +
                        "Position: " + this.position + "\n";
    }

    public double computeMonthlyCompensation() {
        return 0.0;
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

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberOfYearsWorkedSinceHired() {
        int result = 0;
        int currentYear = LocalDate.now().getYear();
        result = (currentYear - this.hireDate.getYear());
        return result;

    }
}

class SalariedEmployee extends Employee {
    double monthlySalary;


    public SalariedEmployee(String employeeName, LocalDate hireDate, String position, double monthlySalary) {
        super(employeeName, hireDate, position);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}

class HourlyEmployee extends Employee {
    int hoursWorkedPerMonth;
    double hourlyRate;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String employeeName, LocalDate hireDate, String position, int hoursWorkedPerMonth, double hourlyRate) {
        super(employeeName, hireDate, position);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;

    }

    public double computeMonthlyCompensation () {
        return hourlyRate * hoursWorkedPerMonth;
    }


    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}


