import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Singleton instance
        InventoryManager manager = InventoryManager.getInstance();

        // Adding New Products
        manager.addProduct(new NewProduct("Laptop"));
        manager.addProduct(new NewProduct("Smartphone"));

        // Adding Legacy Items using Adapter
        LegacyItem item1 = new LegacyItem(101, "Old Keyboard");
        LegacyItem item2 = new LegacyItem(102, "Old Mouse");

        manager.addProduct(new ProductAdapter(item1));
        manager.addProduct(new ProductAdapter(item2));

        // Iterator
        Iterator<Product> iterator = manager.returnInventory();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            product.displayDetails();
        }
    }
}
