import com.polban.jtk.sales.*;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("CPU", 10000, 10);
        Sales sales = new Sales(product);

        //Melakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // Melakukan restock produk
        sales.restockProduct(10);

        // Memperbaharui harga produk
        sales.updateProductPrice(1.4E7);
        sales.updateProductPrice(-13000);
    }
}