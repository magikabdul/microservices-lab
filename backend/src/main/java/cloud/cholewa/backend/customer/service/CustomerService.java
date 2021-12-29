package cloud.cholewa.backend.customer.service;

import cloud.cholewa.backend.customer.dto.CustomerRequest;

public interface CustomerService {

    void registerCustomer(CustomerRequest customerRequest);
}
