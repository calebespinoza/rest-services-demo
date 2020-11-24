package com.caleb.repository;

import com.caleb.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Customer findCustomerById(Integer id);
}
