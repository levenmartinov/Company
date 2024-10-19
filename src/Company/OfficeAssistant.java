package Company;

import java.util.Scanner;

public class OfficeAssistant extends Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Çalışan oluşturma
        Employee employee = Employee.createEmployee(scanner);

        if (employee != null) {
            employee.printDetails();

            // Eğer daha önce nextInt() ya da benzer bir şey kullandıysanız boş satırı temizleyin
            scanner.nextLine();  // Boşluğu temizle

            // Görev atama
            System.out.println("Bu çalışana bir görev atayın:");
            String task = scanner.nextLine();  // Kullanıcıdan görev al
            employee.assignTask(task);  // Görevi çalışana ata

            // Görev tamamlama
            System.out.println("Görevi tamamlamak için bir tuşa basın...");
            scanner.nextLine();  // Kullanıcının tuşa basmasını bekle
            employee.completeTask();  // Görevi tamamla
        }

        scanner.close();
    }
}
