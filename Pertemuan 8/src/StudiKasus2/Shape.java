package StudiKasus2;

public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();  // method abstrak untuk menghitung luas

    @Override
    public String toString() {
        return shapeName;
    }
}

