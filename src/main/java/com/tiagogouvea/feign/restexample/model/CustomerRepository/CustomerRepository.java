package com.tiagogouvea.feign.restexample.model.CustomerRepository;

import com.tiagogouvea.feign.restexample.model.customer.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}