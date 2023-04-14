package Employee_App.Com_HR_Personnel;

public class Department {
    String name;
    String location;
    Employee[] employees = new Employee[100];
    int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        this.employees[currentIndex++] = employee;

    }
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked () {
        int numberOfEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
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
