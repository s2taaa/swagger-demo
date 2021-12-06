package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Customer;
import com.example.spring_boot_api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerImpl implements CustomerService {


    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer save(Customer c) {
        return customerRepository.save(c);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer get(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer update( Customer c) {
        return customerRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);

    }
}

