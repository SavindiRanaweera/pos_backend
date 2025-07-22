package com.pos.grn.model;

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
@Document(collection = "grns")
public class Grn {

    @Id
    private String grnCode;

    private String supplierInvoiceNo; // FK
    private String supplierCode;      // FK
    private String staffCode;         // FK
    private List<String> itemCodes;   // Multivalue FK

    private LocalDate date;
    private BigDecimal amount;
    private List<String> paymentType;

}
