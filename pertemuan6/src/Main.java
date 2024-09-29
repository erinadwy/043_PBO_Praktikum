import CircleCylinder_Classes.Circle;

public class Main {
    public static void main(String[] args) {
        // Menguji constructor default
        Shape shape1 = new Shape();
        System.out.println(shape1);

        // Menguji constructor dengan parameter
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Mengubah atribut menggunakan setter
        shape2.setColor("yellow");
        shape2.setFilled(true);
        System.out.println(shape2);

        // Mengambil nilai atribut menggunakan getter
        System.out.println("Color of shape2: " + shape2.getColor());  // Output: Color of shape2: yellow
        System.out.println("Is shape2 filled? " + shape2.isFilled()); // Output: Is shape2 filled? true
    }
}

