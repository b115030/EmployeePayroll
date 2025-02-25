import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmployeePayroll> empPayrollList;

    public EmployeePayrollService(List<EmployeePayroll> empPayrollList) {
        this.empPayrollList = empPayrollList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Payroll Service.");
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Welcome to EmployeePayrollService system.");
        ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<>();
        EmployeePayrollService empPayrollService = new EmployeePayrollService(employeePayrollList);
        empPayrollService.readEmployeePayrollData(consoleInput);
        empPayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter emp id: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter emp name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter emp salary: ");
        double salary = consoleInputReader.nextDouble();
        empPayrollList.add(new EmployeePayroll(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting emp payroll roaster to console\n" + empPayrollList);
    }
}

