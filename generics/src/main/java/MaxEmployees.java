import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxEmployees {
    public static List<Employee> createEmployees() {
        return Arrays.asList(
                new Employee(1, "Peter Gibbons"),
                new Employee(2, "Samir Jakistam"),
                new Employee(3, "Michael Bolton"),
                new Employee(4, "Milton Waddams")
        );
    }

    public static void main(String[] args) {
        List<Employee> employees = createEmployees();

        Employee maxId = employees.stream()
                .max(Comparator.comparingInt(Employee::getId))
                .orElse(Employee.DEFAULT_EMPLOYEE);

        Employee maxName = employees.stream()
                .max(Comparator.comparing(Employee::getName)).get();

        System.out.println(maxId);
        System.out.println(maxName);
    }
}
