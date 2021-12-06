package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public Customer save(Customer c);
    public List<Customer> getAll();
    public Customer get(Long id);
    public Customer update(Customer c);
    public void delete(Long id);
}