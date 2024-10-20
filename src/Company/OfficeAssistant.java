package Company;

public class OfficeAssistant extends Employee {

    private int officeResponsibility;

    public OfficeAssistant(String name, String surname, double salary, String position, int officeResponsibility) {
        super(name, surname, salary, position);
        this.officeResponsibility = officeResponsibility;
    }

    @Override
    public void printDetails() {
        System.out.println("\nOffice Asistaninin Bilgileri:");
        System.out.println("Isim: " + getName());
        System.out.println("Soyisim: " + getSurname());
        System.out.println("Maas: " + getSalary());
        System.out.println("Pozisyon: " + getPosition());
        System.out.println("Sorumli oldugu office sayisi: " + officeResponsibility);
    }
}
