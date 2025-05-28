import java.util.Scanner;

class Ui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Amazon amazon = new Amazon(null);
        char choiceToContinue;

        do {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    String price = scanner.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();
                    scanner.nextLine();
                    Product product = Product.createProduct(id, name, price, brand);
                    amazon.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = scanner.nextInt();
                    amazon.removeProduct(removeId);
                    break;
                case 3:
                    amazon.displayProduct();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }

            // Ask if the user wants to continue shopping
            System.out.print("Do you want to continue shopping? (y/n): ");
            choiceToContinue = scanner.next().charAt(0);

        } while (choiceToContinue == 'y' || choiceToContinue == 'Y');

        System.out.println("Thank you for shopping with us!");
        scanner.close();
    }
}
