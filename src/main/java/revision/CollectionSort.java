package revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSort {

    public void example() {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }

        System.out.println(nums);

        // sort in ascending
        Collections.sort(nums);

        System.out.println(nums);

        // sort in descending order, both methods work
        Collections.sort(nums, Collections.reverseOrder());
        nums.sort(Comparator.reverseOrder());

        System.out.println(nums);

    }

    public void example2() {
        Employee emp1 = new Employee("1234", "john", "SWE", "coder", "john@mail.com", 14000);
        Employee emp2 = new Employee("12345", "wes", "SWE", "coder", "wes@mail.com", 11000);
        Employee emp3 = new Employee("111", "ted", "SWE", "coder", "ted@mail.com", 13000);
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println(employees); //before sort

        Collections.sort(employees);
        System.out.println(employees); //after sort

        // sorting using comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println(employees);

        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("wes")).collect(Collectors.toList());
        System.out.println(filteredEmployees);
    }

}
