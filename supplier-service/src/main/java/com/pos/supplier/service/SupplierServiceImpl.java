package com.pos.supplier.service;

import com.pos.supplier.model.Supplier;
import com.pos.supplier.repo.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository repository;

    public SupplierServiceImpl(SupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public Supplier save(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public List<Supplier> getAll() {
        return repository.findAll();
    }

    @Override
    public Supplier getById(String code) {
        return repository.findById(code).orElse(null);
    }

    @Override
    public void delete(String code) {
        repository.deleteById(code);
    }
}
