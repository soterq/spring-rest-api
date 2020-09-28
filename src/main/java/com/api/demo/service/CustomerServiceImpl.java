package com.api.demo.service;

import com.api.demo.domain.Customer;
import com.api.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Custom not found"));
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCostumer(Customer customer) {
        return customerRepository.save(customer);
    }


}
