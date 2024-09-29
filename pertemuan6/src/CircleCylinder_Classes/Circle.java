package CircleCylinder_Classes;

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    // Constructors (overloaded)
    /** Constructs a CircleCylinder_Classes.Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a CircleCylinder_Classes.Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /** Returns the area of this CircleCylinder_Classes.Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Return a self-descriptive string of this instance in the form of
     CircleCylinder_Classes.Circle[radius=?,color=?] */
    public String toString() {
        return "CircleCylinder_Classes.Circle[radius=" + radius + " color=" + color + "]";
    }

    public String getPerimeter() {
        return null;
    }
}