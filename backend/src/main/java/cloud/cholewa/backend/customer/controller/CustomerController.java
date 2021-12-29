package cloud.cholewa.backend.customer.controller;

import cloud.cholewa.backend.customer.dto.CustomerRequest;
import cloud.cholewa.backend.customer.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerServiceImpl customerService;

    @PostMapping
    public ResponseEntity<?> registerCustomer(@RequestBody CustomerRequest customerRequest) {
        log.info("New customer registration {}", customerRequest);
        customerService.registerCustomer(customerRequest);
        return ResponseEntity.accepted().build();
    }
}
