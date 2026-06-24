package di;

// Test class to demonstrate Dependency Injection
public class DependencyInjectionTest {
    public static void main(String[] args) {
        System.out.println("=== Dependency Injection Example ===\n");

        // Create the concrete repository implementation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into the service via constructor
        CustomerService service = new CustomerService(repository);

        // Use the service to find customers
        System.out.println("--- Finding Customers ---\n");

        System.out.println(service.getCustomerDetails(1));
        System.out.println();
        System.out.println(service.getCustomerDetails(3));
        System.out.println();
        System.out.println(service.getCustomerDetails(5)); // Non-existent customer
        System.out.println();

        // Demonstrating that we can easily swap implementations
        System.out.println("--- Benefits of DI ---");
        System.out.println("The CustomerService depends on the CustomerRepository interface,");
        System.out.println("not the concrete implementation. This allows easy swapping of");
        System.out.println("implementations (e.g., switching from in-memory to a real database)");
        System.out.println("without modifying the service class.");
    }
}
