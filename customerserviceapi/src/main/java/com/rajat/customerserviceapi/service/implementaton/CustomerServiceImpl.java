package com.rajat.customerserviceapi.service.implementaton;

import com.rajat.customerserviceapi.entity.Customer;
import com.rajat.customerserviceapi.repository.CustomerRepository;
import com.rajat.customerserviceapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


}
