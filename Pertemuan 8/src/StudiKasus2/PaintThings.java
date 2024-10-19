package StudiKasus2;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350);  // Coverage cat: 350 satuan luas per galon

        // Membuat objek-objek bentuk
        Shape deck = new Rectangle(20, 35);  // Persegi panjang 20x35 kaki
        Shape bigBall = new Sphere(15);      // Bola dengan radius 15 kaki
        Shape tank = new Cylinder(10, 30);   // Silinder dengan radius 10 kaki dan tinggi 30 kaki

        // Menghitung jumlah cat yang dibutuhkan untuk setiap bentuk
        double deckAmount = paint.amount(deck);
        double ballAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        // Menampilkan hasilnya
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck: " + fmt.format(deckAmount));
        System.out.println("Big Ball: " + fmt.format(ballAmount));
        System.out.println("Tank: " + fmt.format(tankAmount));
    }
}

