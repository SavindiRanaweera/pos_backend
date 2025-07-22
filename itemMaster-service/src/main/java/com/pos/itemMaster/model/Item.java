package com.pos.itemMaster.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "items")
public class Item {

    @Id
    private String itemCode;

    private List<String> name;         // Multivalued attribute
    private String description;
    private BigDecimal retailPrice;
    private BigDecimal costPrice;
    private int qty;
    private String supplierCode;       // FK to supplier
    private String itemType;
    private double discount;
    private LocalDate expDate;


}
