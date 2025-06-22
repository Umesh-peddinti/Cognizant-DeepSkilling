package Week1_DesignPatternsAndPrinciples.Ex11_DependencyInjectionExample.Code;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String customerId) {
        // For demonstration, returning a mock customer
        return "Customer[ID=" + customerId + ", Name=John Doe]";
    }
}