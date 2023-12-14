package T2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }

    public int getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }
}
