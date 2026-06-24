package di;

import java.util.HashMap;
import java.util.Map;

// Concrete Repository Implementation
public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, String> customerDatabase;

    public CustomerRepositoryImpl() {
        // Simulating a database with a HashMap
        customerDatabase = new HashMap<>();
        customerDatabase.put(1, "Alice Johnson");
        customerDatabase.put(2, "Bob Smith");
        customerDatabase.put(3, "Charlie Brown");
        customerDatabase.put(4, "Diana Prince");
    }

    @Override
    public String findCustomerById(int id) {
        String customer = customerDatabase.get(id);
        if (customer != null) {
            return customer;
        }
        return "Customer not found with ID: " + id;
    }
}
