package di;

// Service class with constructor injection
public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor Injection - dependency is injected via the constructor
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerDetails(int id) {
        System.out.println("Service: Looking up customer with ID " + id + "...");
        String customer = customerRepository.findCustomerById(id);
        return "Customer Details: " + customer;
    }
}
