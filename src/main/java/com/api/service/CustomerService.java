package com.api.service;

import com.api.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCostumer(Customer customer);
}
