package com.pos.customer.controller;

import com.pos.customer.model.Customer;
import com.pos.customer.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity.ok(service.getAllCustomers());
    }

    @GetMapping("/{code}")
    public ResponseEntity<Customer> getById(@PathVariable String code) {
        return ResponseEntity.ok(service.getCustomerById(code));
    }

    @PostMapping
    public ResponseEntity<Customer> create(@Valid @RequestBody Customer customer) {
        return ResponseEntity.ok(service.saveCustomer(customer));
    }

    @PutMapping("/{code}")
    public ResponseEntity<Customer> update(@PathVariable String code, @Valid @RequestBody Customer customer) {
        return ResponseEntity.ok(service.updateCustomer(code, customer));
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> delete(@PathVariable String code) {
        service.deleteCustomer(code);
        return ResponseEntity.noContent().build();
    }
}
