package com.pos.supplier.controller;

import com.pos.supplier.model.Supplier;
import com.pos.supplier.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    private final SupplierService service;

    public SupplierController(SupplierService service) {
        this.service = service;
    }

    @PostMapping
    public Supplier create(@RequestBody Supplier supplier) {
        return service.save(supplier);
    }

    @GetMapping
    public List<Supplier> getAll() {
        return service.getAll();
    }

    @GetMapping("/{code}")
    public Supplier getById(@PathVariable String code) {
        return service.getById(code);
    }

    @DeleteMapping("/{code}")
    public void delete(@PathVariable String code) {
        service.delete(code);
    }
}
