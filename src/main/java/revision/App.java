package revision;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        CSVWriter csvw = new CSVWriter();
        List<Employee> employees = csvw.generateEmployees();
        csvw.writeToCSV(employees, "./test.txt");


        CSVReader csvr = new CSVReader();
        List<Employee> employeeArr = csvr.readEmployees("./test.txt");
        System.out.println(employeeArr);

    }
}
