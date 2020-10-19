package com.api.controllers;

import com.api.domain.Customer;
import com.api.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
@CrossOrigin
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";
    private final CustomerService customerServices;

    public CustomerController(CustomerService customerServices) {
        this.customerServices = customerServices;
    }

    @GetMapping
    List<Customer> getAllCustomers() {
        return customerServices.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerServices.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerServices.saveCostumer(customer);
    }


}