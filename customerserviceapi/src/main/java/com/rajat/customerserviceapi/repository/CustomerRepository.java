package com.rajat.customerserviceapi.repository;

import com.rajat.customerserviceapi.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
