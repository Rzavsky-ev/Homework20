import java.util.*;

public class EmployeeBookMap {
    private final Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(String lastNameFirstName) {
        Employee employee = new Employee(lastNameFirstName);
        employees.put(employee.getLastNameFirstName(), employee);
    }

    public void removeEmployee(String lastNameFirstName) {
        employees.remove(lastNameFirstName);
    }

    public Employee findEmployee(String lastNameFirstName) {
        return employees.get(lastNameFirstName);
    }

    @Override
    public String toString() {
        String result = "";
        for (Employee employee : employees.values()) {
            result += employee.toString() + "\n";
        }
        return result;
    }


}
