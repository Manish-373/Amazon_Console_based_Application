public class Cart 
{
    private Product[] products;

    public Cart() {
        products = new Product[10]; // Fixed-size array
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) { // Find the first empty slot
                products[i] = product;
                System.out.println("Product with ID " + product.getId() + " added to cart.");
                return;
            }
        }
        System.out.println("Cart is full! Cannot add more products.");
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == id) {
                products[i] = null;
                System.out.println("Product with ID " + id + " removed from cart.");
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found in cart.");
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        boolean isEmpty = true;
        for (Product product : products) {
            if (product != null) {
                product.displayCart();
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Cart is empty.");
        }
    }
    public Product[] getProducts() {
        return products;
    }
    
}
