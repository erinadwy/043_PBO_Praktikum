package multipleInheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 3000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 2000000, 1, 11, 1993);

        // Menaikkan gaji pegawai
        for (Employee emp : staff) {
            emp.raiseSalary(5);
        }

        // Menampilkan informasi sebelum pengurutan
        System.out.println("Sebelum pengurutan:");
        for (Employee emp : staff) {
            emp.print();
        }

        // Mengurutkan pegawai menggunakan metode shell_sort
        Sortable.shell_sort(staff);

        // Menampilkan informasi setelah pengurutan
        System.out.println("\nSetelah pengurutan:");
        for (Employee emp : staff) {
            emp.print();
        }
    }
}
