package Week1_DesignPatternsAndPrinciples.Ex11_DependencyInjectionExample.Code;

  
public class Main {
    public static void main(String[] args) {
        // Create the dependency
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject dependency into service
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.getCustomerDetails("C123");
    }
}

