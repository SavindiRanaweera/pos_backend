package com.pos.customer.service;

import com.pos.customer.model.Customer;
import com.pos.customer.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(String code) {
        return repository.findById(code)
                .orElseThrow(() -> new RuntimeException("Customer not found with code: " + code));
    }

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public Customer updateCustomer(String code, Customer updatedCustomer) {
        Customer existing = getCustomerById(code);
        existing.setName(updatedCustomer.getName());
        existing.setAddress(updatedCustomer.getAddress());
        existing.setContact(updatedCustomer.getContact());
        existing.setCustomer_group(updatedCustomer.getCustomer_group());
        return repository.save(existing);
    }

    public void deleteCustomer(String code) {
        if (!repository.existsById(code)) {
            throw new RuntimeException("Customer not found with code: " + code);
        }
        repository.deleteById(code);
    }
}
