package com.rajat.customerserviceapi.controller;

import com.rajat.customerserviceapi.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rajat.customerserviceapi.service.CustomerService;

import java.util.List;

@RestController
public class CustomerController {
    static final String CUSTOMER_API_ENDPOINT = "/customer";

    @Autowired
    private CustomerService customerService;

    @GetMapping(CUSTOMER_API_ENDPOINT)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping(CUSTOMER_API_ENDPOINT)
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
