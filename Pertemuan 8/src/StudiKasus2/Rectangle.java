package StudiKasus2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;  // Luas persegi panjang
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}

