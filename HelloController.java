package com.task.sample.controller;

import com.task.sample.dao.CustomerRepository;
import com.task.sample.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/hello")
    public List<Customer> hello() {
        return (List<Customer>) repository.findAll();
    }
}