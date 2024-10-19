public class Commission extends Hourly {
    private double totalSales;   // Total penjualan
    private double commissionRate; // Persentase komisi (dalam desimal)

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    // Menambahkan penjualan ke totalSales
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Menghitung gaji dengan menambahkan komisi dari penjualan ke gaji per jam
    @Override
    public double pay() {
        double payment = super.pay();  // Menghitung gaji dari jam kerja (method dari Hourly)
        payment += totalSales * commissionRate;  // Menambahkan komisi dari totalSales
        totalSales = 0.0;  // Mengatur kembali totalSales ke 0 setelah gaji dibayar
        return payment;
    }

    // Menambahkan informasi total penjualan ke method toString
    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
