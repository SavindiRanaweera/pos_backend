package com.pos.grn.repo;

import com.pos.grn.model.Grn;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GrnRepository extends MongoRepository<Grn, String> {
}
