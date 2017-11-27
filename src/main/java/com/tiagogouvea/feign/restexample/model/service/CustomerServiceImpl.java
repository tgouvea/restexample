package com.tiagogouvea.feign.restexample.model.service;

import com.tiagogouvea.feign.restexample.model.CustomerRepository.CustomerRepository;
import com.tiagogouvea.feign.restexample.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
