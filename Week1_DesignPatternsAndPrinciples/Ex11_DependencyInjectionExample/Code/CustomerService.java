package Week1_DesignPatternsAndPrinciples.Ex11_DependencyInjectionExample.Code;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerDetails(String customerId) {
        String customer = customerRepository.findCustomerById(customerId);
        System.out.println("Customer Details: " + customer);
    }
}