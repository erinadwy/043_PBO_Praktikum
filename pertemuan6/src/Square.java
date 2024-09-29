public class Square extends Rectangle{
    public Square() {
        super(1.0, 1.0);  // Memanggil constructor Rectangle dengan sisi 1.0
    }

    // Constructor dengan side
    public Square(double side) {
        super(side, side);  // Memanggil constructor Rectangle dengan sisi yang sama
    }

    // Constructor dengan side, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // Memanggil constructor Rectangle
    }

    // Getter untuk side
    public double getSide() {
        return getWidth();  // Karena width dan length sama, ambil salah satu
    }

    // Setter untuk side (mengubah width dan length sekaligus)
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth dan setLength agar tetap menjaga nilai yang sama
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
