package Company;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, String surname, double salary, String position, int teamSize) {
        super(name, surname, salary, position);
        this.teamSize = teamSize;
    }

    @Override
    public void printDetails() {
        System.out.println("\nYonetici Bilgileri:");
        System.out.println("Isim: " + getName());
        System.out.println("Soyisim: " +getSurname());
        System.out.println("Maas: " + getSalary());
        System.out.println("Pozisyon: " + getPosition());
        System.out.println("Ekip buyuklugu: " + teamSize);

    }






}
