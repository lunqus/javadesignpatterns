package mvcDesignPattern;

import mvcDesignPattern.controller.EmployeeController;
import mvcDesignPattern.model.Employee;
import mvcDesignPattern.view.EmployeeDashboardView;

public class MainMVC {

    public static void main(String[] args) {

        Employee employee = retrieveEmployeeFromServer();

        // Create our viewto which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();

        // Create our controller
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateDashboerdView();
    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSsNumber("23344215");
        employee.setSsNumber("125000");
        return employee;
    }
}
