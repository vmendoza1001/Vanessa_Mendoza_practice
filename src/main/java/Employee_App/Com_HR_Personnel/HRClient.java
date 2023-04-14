package Employee_App.Com_HR_Personnel;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Department department = new Department("Development", "Clifton, NJ");

        Employee employee1 = new SalariedEmployee ("Elizabeth Bennet", LocalDate.of (2010, 8, 24), "UX Designer", 2500);
        department.addEmployee(employee1);
        employee1.getEmployeeInfo();


        Employee employee2 = new SalariedEmployee("Fitzwilliam Darcy", LocalDate.of(2013, 05, 03), "Back End Engineer", 3600);
        department.addEmployee(employee1);
        employee2.getEmployeeInfo();

        Employee employee3 = new HourlyEmployee("Charles Bingley", LocalDate.of (2019, 11, 06), "DataAnalyst", 160, 23);
        department.addEmployee(employee1);
        employee3.getEmployeeInfo();


        String employeeInfo = employee1.getEmployeeInfo() + employee1.getNumberOfYearsWorkedSinceHired() + "\n" + employee1.computeMonthlyCompensation();
        System.out.println(employeeInfo + "\n");


        employeeInfo = employee2.getEmployeeInfo() + employee2.getNumberOfYearsWorkedSinceHired() + "\n" + employee2.computeMonthlyCompensation();
        System.out.println(employeeInfo + "\n");

        employeeInfo = employee3.getEmployeeInfo() + employee3.getNumberOfYearsWorkedSinceHired() + "\n" + employee3.computeMonthlyCompensation() + "\n";
        System.out.println(employeeInfo);

        int departmentInfo = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.printf("We have %d employees working in the %s department at our %s location.\n", departmentInfo,
                department.getName(), department.getLocation());
    }
}