package revision;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "staffNo, fullName, department, role, emailAdd, salary";

    public List<Employee> employees = null;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<>();

        Employee emp1 = new Employee("1234", "john", "SWE", "coder", "john@mail.com", 14000);
        Employee emp2 = new Employee("12345", "wes", "SWE", "coder", "wes@mail.com", 11000);
        Employee emp3 = new Employee("111", "ted", "SWE", "coder", "ted@mail.com", 13000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.append(FILE_HEADER.toString()); // write fileheader to CSV
        fw.append(NEWLINE_SEPARATOR);

        for (Employee e : employees) {
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAdd());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(NEWLINE_SEPARATOR);
        }
        fw.flush();
        fw.close();
    }
}
