package code.with.vanilson.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest customerRegister) {
        Customer customer = Customer.builder()
                .firstName(customerRegister.firstName())
                .lastName(customerRegister.lastName())
                .email(customerRegister.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        // todo:store customer in db

    }
}