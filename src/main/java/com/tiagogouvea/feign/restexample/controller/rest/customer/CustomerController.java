package com.tiagogouvea.feign.restexample.controller.rest.customer;

import com.tiagogouvea.feign.restexample.model.customer.Customer;
import com.tiagogouvea.feign.restexample.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.ws.rs.POST;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> getAll(){

        List<Customer> customers = customerService.getAll();

        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> create(@RequestBody Customer customer){

        Customer customerSaved = customerService.save(customer);

        return new ResponseEntity<Customer>(customerSaved, HttpStatus.CREATED);

    }

}
