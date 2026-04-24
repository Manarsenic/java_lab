import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventoryManager {
    private static InventoryManager instance;
    private List<Product> productList;

    // Private constructor (Singleton)
    private InventoryManager() {
        productList = new ArrayList<>();
    }

    // Get single instance
    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    // Add product
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Return iterator
    public Iterator<Product> returnInventory() {
        return productList.iterator();
    }
}
