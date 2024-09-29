public class Circle extends Shape{
    private double radius;
    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);  // Memanggil constructor superclass
        this.radius = radius;
    }

    // Getter dan Setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method untuk menghitung area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
