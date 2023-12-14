package T2;

public class MVCPatternTest {
    public static void main(String[] args) {
        Employee model = new Employee();
        model.setName("John");
        model.setSalary(50000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Lena");
        controller.setEmployeeSalary(60000);

        controller.updateView();
    }
}
