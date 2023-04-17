package Employee_App.Com_HR_Personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    String location;
    //[] employees = new Employee[100];
    private List<Employee> employees = new ArrayList<Employee>();
    int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        //this.employees[currentIndex++] = employee;
        this.employees.add(employee);

    }
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked () {
        int numberOfEmployees = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).worked().contains("worked")) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;

    }

    public double computeDepartmentMonthlyTotalCompensation () {
        return 0.0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
