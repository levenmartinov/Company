package Company;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee employee = Employee.createEmployee(scanner);

        if (employee != null) {
            employee.printDetails();

            scanner.nextLine();

            System.out.println("Bu calisana bir gorev atayin:");
            String task = scanner.nextLine();
            employee.assignTask(task);

            System.out.println("Gorevi tamamlamak icin bir tusa basin...");
            scanner.nextLine();
            employee.completeTask();

        }

        scanner.close();

    }
}
