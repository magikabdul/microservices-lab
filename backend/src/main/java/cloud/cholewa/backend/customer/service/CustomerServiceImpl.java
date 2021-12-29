package cloud.cholewa.backend.customer.service;

import cloud.cholewa.backend.customer.dto.CustomerRequest;
import cloud.cholewa.backend.customer.model.CustomerEntity;
import cloud.cholewa.backend.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void registerCustomer(CustomerRequest customerRequest) {
        CustomerEntity customerEntity = CustomerEntity.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();

        customerRepository.save(customerEntity);
    }
}
