package StudiKasus2;

public class Paint {
    private double coverage;  // Coverage cat dalam satuan luas per satuan cat

    public Paint(double c) {
        this.coverage = c;
    }

    // Metode untuk menghitung jumlah cat yang diperlukan
    public double amount(Shape s) {
        System.out.println("Computing amount of paint for " + s);
        return s.area() / coverage;  // Jumlah cat = luas bentuk / coverage
    }
}

