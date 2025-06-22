package Week1_DesignPatternsAndPrinciples.Ex11_DependencyInjectionExample.Code;

public interface CustomerRepository {
    String findCustomerById(String customerId);
}