package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.entity.Customer;
import com.example.spring_boot_api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

        @Autowired
        private CustomerService customerService;
        @GetMapping
        public List<Customer> getAll(){
            return customerService.getAll();
        }

        @PostMapping
        public String create(@RequestBody Customer user){
            customerService.save(user);
            return "saved";
        }

        @GetMapping("/{id}")
        public Customer get(@PathVariable("id") Long id){
            return customerService.get(id);
        }

        @PutMapping("/{id}")
        public String update(@RequestBody Customer user){
            customerService.update(user);
            return "updated";
        }

        @DeleteMapping("/{id}")
        public String delete(@PathVariable("id") long id){
            customerService.delete(id);
            return "deleted";
        }
    }

