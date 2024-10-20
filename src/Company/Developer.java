package Company;

public class Developer extends Employee {

    private String expertise;

    public Developer(String name, String surname, double salary, String position, String expertise) {
        super(name, surname, salary, position);
        this.expertise = expertise;
    }

    @Override
    public void printDetails() {
        System.out.println("\nGelistirici Bilgileri:");
        System.out.println("Isim: " + getName());
        System.out.println("Soyisim: " + getSurname());
        System.out.println("Maas: " + getSalary());
        System.out.println("Pozisyon: " + getPosition());
        System.out.println("Uzmanlik alani: " + expertise);

    }
}
