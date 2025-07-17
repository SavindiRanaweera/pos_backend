package com.pos.item.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

    public Item() {
    }

    public Item(String itemCode, List<String> name, String description, BigDecimal retailPrice, BigDecimal costPrice,
                int qty, String supplierCode, String itemType, double discount, LocalDate expDate) {
        this.itemCode = itemCode;
        this.name = name;
        this.description = description;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
        this.qty = qty;
        this.supplierCode = supplierCode;
        this.itemType = itemType;
        this.discount = discount;
        this.expDate = expDate;
    }

    public String getItemCode () {
        return itemCode;
    }

    public void setItemCode ( String itemCode ) {
        this.itemCode = itemCode;
    }

    public List<String> getName () {
        return name;
    }

    public void setName ( List<String> name ) {
        this.name = name;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

    public BigDecimal getRetailPrice () {
        return retailPrice;
    }

    public void setRetailPrice ( BigDecimal retailPrice ) {
        this.retailPrice = retailPrice;
    }

    public BigDecimal getCostPrice () {
        return costPrice;
    }

    public void setCostPrice ( BigDecimal costPrice ) {
        this.costPrice = costPrice;
    }

    public int getQty () {
        return qty;
    }

    public void setQty ( int qty ) {
        this.qty = qty;
    }

    public String getSupplierCode () {
        return supplierCode;
    }

    public void setSupplierCode ( String supplierCode ) {
        this.supplierCode = supplierCode;
    }

    public String getItemType () {
        return itemType;
    }

    public void setItemType ( String itemType ) {
        this.itemType = itemType;
    }

    public double getDiscount () {
        return discount;
    }

    public void setDiscount ( double discount ) {
        this.discount = discount;
    }

    public LocalDate getExpDate () {
        return expDate;
    }

    public void setExpDate ( LocalDate expDate ) {
        this.expDate = expDate;
    }
}
