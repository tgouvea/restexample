package com.tiagogouvea.feign.restexample.model.service;

import com.tiagogouvea.feign.restexample.model.customer.Customer;

import java.util.List;

public interface CustomerService {

    public Customer save(Customer customer);

    public List<Customer> getAll();

}
