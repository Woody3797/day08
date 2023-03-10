package revision;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";

    public List<Employee> employees = new ArrayList<>();

    public List<Employee> readEmployees(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        line = br.readLine();

        while ((line = br.readLine()) != null) {
            String[] str = line.split(COMMA_DELIMITER);

            Employee employee = new Employee(str[0], str[1], str[2], str[3], str[4], Integer.parseInt(str[5]));
            employees.add(employee);
        }
        br.close();
        fr.close();
        return employees;
    }
}
