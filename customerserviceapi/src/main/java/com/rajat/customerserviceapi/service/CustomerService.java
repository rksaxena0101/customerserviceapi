package com.rajat.customerserviceapi.service;

import com.rajat.customerserviceapi.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer addCustomer(Customer customer);
}
