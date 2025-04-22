import java.util.ArrayList;
import java.util.List;

public class Sales {
    List<Product> products = new ArrayList<>();
    double priceTotal = 0;

    public void addProduct(Product p) {
        products.add(p);
    }

    public void calcuProduct() throws EmptySellException {
        if (products.isEmpty()) {
            throw new EmptySellException("For selling is mandatory to add products at first");
        }

        priceTotal = 0;
        for (Product p : products) {
            priceTotal += p.price;
        }

        System.out.println("Total: " + priceTotal + "€");
    }
}