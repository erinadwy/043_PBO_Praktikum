public class Volunteer extends StaffMember {
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone); // menggunakan variable dari superclass
    }

    // Volunteer tidak dibayar
    @Override
    public double pay() {
        return 0.0;
    }
}
