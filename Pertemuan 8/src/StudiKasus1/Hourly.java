public class Hourly extends Employee {
    private int hoursWorked;

    // Konstruktor Hourly
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    // Menambahkan jam kerja
    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    // Menghitung gaji berdasarkan jam kerja
    @Override
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;  // Reset jam kerja setelah membayar
        return payment;
    }

    // Menambahkan informasi jam kerja ke metode toString
    @Override
    public String toString() {
        String result = super.toString();
        result+= "\nCurrent hours: "+ hoursWorked;
        return result;
//        return super.toString() + "\nCurrent hours: " + hoursWorked;
    }
}
