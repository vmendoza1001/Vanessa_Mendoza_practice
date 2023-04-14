package Employee_App.Com_HR_Personnel;

import java.time.LocalDate;


public abstract class Employee {
    private String name;
    private LocalDate hireDate;
    private String position;

    public Employee() {

    }

    public Employee(String name, LocalDate hireDate, String position) {
        this.name = name;
        this.hireDate = hireDate;
        this.position = position;
    }

    public abstract String getEmployeeInfo();


    public abstract double computeMonthlyCompensation();

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
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

    public int computeNumberOfYearsWorkedSinceHired() {
        int years = 0;
        int currentYear = LocalDate.now().getYear();
        years = (currentYear - this.hireDate.getYear());
        return years;

    }
}

class SalariedEmployee extends Employee {
    double monthlySalary;


    public SalariedEmployee(String employeeName, LocalDate hireDate, String position, double monthlySalary) {
        super(employeeName, hireDate, position);
        this.monthlySalary = monthlySalary;
    }


    public String getEmployeeInfo() {
        return "Employee Name: " + super.getName() + "\n" + "Date Hired: " + super.getHireDate() + "\n" + "Position: " + super.getPosition() + "\n" +
                "Monthly Salary " + getMonthlySalary() + "\n";

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
    public String getEmployeeInfo () {
        return "Employee Name: " + super.getName() + "\n" + "Date Hired: " + super.getHireDate() + "\n" + "Position: " +
                super.getPosition() + "\n" + hourlyRate + hoursWorkedPerMonth + "\n";
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


