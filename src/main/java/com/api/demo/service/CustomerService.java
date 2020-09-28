package com.api.demo.service;

import com.api.demo.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCostumer(Customer customer);
}
