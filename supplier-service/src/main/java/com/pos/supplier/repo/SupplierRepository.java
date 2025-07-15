package com.pos.supplier.repo;

import com.pos.supplier.model.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Supplier, String> {}
