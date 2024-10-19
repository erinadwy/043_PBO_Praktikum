public class Executive extends Employee {
    private double bonus;

    // Konstruktor Executive
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0.0;  // Inisialisasi bonus ke 0
    }

    // Menetapkan bonus untuk eksekutif
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    // Menghitung gaji eksekutif termasuk bonus
    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;  // Reset bonus setelah dibayar
        return payment;
    }
}
