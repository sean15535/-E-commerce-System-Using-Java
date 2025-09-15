import com.ecommerce.Customer;
import com.ecommerce.Product;
import com.ecommerce.orders.Order;

import java.util.List;
import java.util.Scanner;


public class Main {
    private static final Scanner IN = new Scanner(System.in);
    private static final List<Product> CATALOG = List.of(
            new Product(101, "Wireless Mouse", 29.99),
            new Product(102, "Mechanical Keyboard", 89.00),
            new Product(103, "27-inch Monitor", 249.99),
            new Product(104, "USB-C Hub", 45.50)
    );

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = IN.nextLine().trim();
        Customer customer = new Customer(1, name);

        boolean shopping = true;
        while (shopping) {
            displayCatalog();
            int choice = readInt("Select product # to add to cart (0 to checkout, -1 to exit): ");
            if (choice == -1) {
                shopping = false;
            } else if (choice == 0) {
                if (customer.getCartContents().isEmpty()) {
                    System.out.println("Cart is empty – nothing to checkout.\n");
                } else {
                    Order order = new Order(customer);
                    System.out.println(order.generateSummary());
                    customer.clearCart();
                    shopping = false;
                }
            } else if (choice >= 101 && choice <= 104) {
                Product selected = CATALOG.stream()
                                          .filter(p -> p.getProductId() == choice)
                                          .findFirst()
                                          .orElseThrow();
                customer.addToCart(selected);
                System.out.printf("Added %s to cart. Current total: $%.2f\n\n",
                        selected.getName(), customer.calculateCartTotal());
            } else {
                System.out.println("Invalid selection.\n");
            }
        }
        System.out.println("Thank you for visiting!");
    }

    private static void displayCatalog() {
        System.out.println("\n========== CATALOG ==========");
        CATALOG.forEach(p -> System.out.printf("%d  –  %s  ($%.2f)\n",
                p.getProductId(), p.getName(), p.getPrice()));
        System.out.println("==============================\n");
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!IN.hasNextInt()) {
            IN.next(); // discard non-int
            System.out.print(prompt);
        }
        return IN.nextInt();
    }
}