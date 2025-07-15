package com.pos.supplier.service;

import com.pos.supplier.model.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier save(Supplier supplier);
    List<Supplier> getAll();
    Supplier getById(String code);
    void delete(String code);
}
