import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapEmployees {
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
        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

        List<Integer> ids = employees.stream().map(Employee::getId).collect(Collectors.toList());
        System.out.println(ids);

        int totalLength = employees.stream().map(Employee::getName).mapToInt(String::length).sum();
        System.out.println(totalLength);

        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println(employeeMap);

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
