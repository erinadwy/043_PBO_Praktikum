public class Staff {
    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];

        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        // Tambahan 2 karyawan
        staffList[6] = new Commission("Erina", "78 Usman Dhomiri", "222-9080", "123-45-67895", 6.25, 0.2);  // 20% komisi
        staffList[7] = new Commission("Dwi", "222 Permata", "345-5678", "212-33-4344", 9.75, 0.15); // 15% komisi

        // Mengatur jam kerja dan penjualan untuk karyawan dengan komisi
        ((Commission) staffList[6]).addSales(400);  // Tambahkan penjualan untuk Erina
        ((Hourly) staffList[6]).addHours(35);  // Erina bekerja 35 jam

        ((Commission) staffList[7]).addSales(950);  // Tambahkan penjualan untuk Dwi
        ((Hourly) staffList[7]).addHours(40);  // Dwi  bekerja 40 jam

        ((Executive)staffList[0]).awardBonus (500.00);
        ((Hourly)staffList[3]).addHours (40);
    }

    public void payday() {
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            double amount = staffList[count].pay();  // Menghitung gaji

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
