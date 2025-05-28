
public class Amazon 
{
    private Cart cart;

    public Amazon(Product product) 
    {
        this.cart = new Cart();
    }

    public void addProduct(Product product) {
        cart.addProduct(product);
    }

    public void removeProduct(int id) {
        cart.deleteProduct(id);
    }

    public void displayProduct() {
        cart.displayCart();
    }
    public void updateProductDetails(int id, String newName, String newPrice, String newBrand) {
        Product[] products = cart.getProducts(); // Requires a public getter in Cart
    
        boolean found = false;
        for (Product product : products) {
            if (product != null && product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setBrand(newBrand);
                System.out.println("Product updated successfully.");
                found = true;
                break;
            }
        }
    
        if (!found) {
            System.out.println("Product with ID " + id + " not found in the cart.");
        }
    }
    
}
