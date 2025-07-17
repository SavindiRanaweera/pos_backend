package com.pos.itemMaster.repo;

import com.pos.itemMaster.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}
