public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    // Konstruktor Employee
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    // Menghasilkan string yang menggambarkan karyawan
    @Override
    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }

    // Mengembalikan gaji karyawan
    @Override
    public double pay() {
        return payRate;
    }
}
