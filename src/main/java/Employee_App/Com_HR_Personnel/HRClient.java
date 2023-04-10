package Employee_App.Com_HR_Personnel;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Elizabeth Bennet");
        employee1.setPosition("UX designer");
        employee1.setHireDate(LocalDate.of (2010, 8, 24));
        employee1.getEmployeeInfo();
        employee1.getNumberOfYearsWorkedSinceHired();

        Employee employee2 = new Employee();
        employee2.setEmployeeName("Fitzwilliam Darcy");
        employee2.setHireDate(LocalDate.of (2013, 5, 8));
        employee2.setPosition("Back End Engineer");
        employee2.getEmployeeInfo();



        String employeeInfo = employee1.getEmployeeInfo() + employee1.getNumberOfYearsWorkedSinceHired();
        System.out.println(employeeInfo);


        employeeInfo = employee2.getEmployeeInfo() + employee2.getNumberOfYearsWorkedSinceHired();
        System.out.println(employeeInfo);
    }
}