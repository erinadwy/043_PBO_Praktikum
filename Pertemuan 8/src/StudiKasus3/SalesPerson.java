package StudiKasus3;

public class SalesPerson implements Comparable<SalesPerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalesPerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    // Implementasi compareTo dari Comparable
    @Override
    public int compareTo(SalesPerson other) {
        // Bandingkan berdasarkan total penjualan
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales;  // Urutkan dari penjualan tertinggi ke terendah
        } else {
            // Jika penjualan sama, bandingkan berdasarkan nama belakang (urutan abjad)
            return this.lastName.compareTo(other.lastName);
        }
    }

    // Implementasi equals untuk membandingkan SalesPerson berdasarkan nama depan dan belakang
    @Override
    public boolean equals(Object other) {
        if (other instanceof SalesPerson) {
            SalesPerson otherPerson = (SalesPerson) other;
            return this.firstName.equals(otherPerson.getFirstName()) &&
                    this.lastName.equals(otherPerson.getLastName());
        }
        return false;
    }

    // toString untuk menampilkan informasi SalesPerson
    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + totalSales;
    }

    // Getter untuk firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter untuk lastName
    public String getLastName() {
        return lastName;
    }

    // Getter untuk totalSales
    public int getTotalSales() {
        return totalSales;
    }
}


