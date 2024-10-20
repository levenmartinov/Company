package Company;

import java.util.Scanner;

public abstract class Employee implements TaskHandler {

    private String name;
    private String surname;
    private double salary;
    private String position;
    private String assignedTask;

    public Employee(String name, String surname, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setAssignedTask(String assignedTask) {
        this.assignedTask = assignedTask;
    }

    public String getAssignedTask() {
        return assignedTask;
    }


    @Override
    public void assignTask(String task) {
        this.assignedTask = task;
        System.out.println(name + " adli calisana gorev atandi: " + task);
    }

    @Override
    public void completeTask() {
        if (this.assignedTask != null) {
            System.out.println(name + " adli calisan gorevi tamamlandi: " + assignedTask);
            assignedTask = null;
        } else {
            System.out.println(name + " adli calisanin atanan bir gorevi yok.");
        }
    }

    public abstract void printDetails();


    public static Employee createEmployee(Scanner scanner) {
        System.out.println("Calisan Tipi Secen: \n1- Manager \n2- Developer  \n3- Office Assistant:");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Isim: ");
        String name = scanner.nextLine();
        System.out.println("Soyisim: ");
        String surname = scanner.nextLine();
        System.out.println("Maas: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pozisyon: ");
        String position = scanner.nextLine();

        if (type == 1) {
            System.out.println("Ekip buyuklugu: ");
            int teamSize = scanner.nextInt();
            return new Manager(name, surname, salary, position,teamSize);

        } else if (type == 2) {
            System.out.println("Uzmanlik alani: ");
            String expertise = scanner.nextLine();
            return new Developer(name, surname, salary, position, expertise);

        } else if (type == 3) {
            System.out.println("Kac tane officeten sorumlu: ");
            int officeResponsibility = scanner.nextInt();
            return new OfficeAssistant(name, surname, salary, position, officeResponsibility);

        } else {
            System.out.println("Gecersiz secim!");
            return null;
        }

    }

}
