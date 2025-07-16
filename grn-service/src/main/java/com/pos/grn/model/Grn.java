package com.pos.grn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

    public Grn ( String grnCode, String supplierInvoiceNo, String staffCode, String supplierCode, List<String> itemCodes, LocalDate date, BigDecimal amount, List<String> paymentType ) {
        this.grnCode = grnCode;
        this.supplierInvoiceNo = supplierInvoiceNo;
        this.staffCode = staffCode;
        this.supplierCode = supplierCode;
        this.itemCodes = itemCodes;
        this.date = date;
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public String getGrnCode() {
        return grnCode;
    }

    public void setGrnCode(String grnCode) {
        this.grnCode = grnCode;
    }

    public String getSupplierInvoiceNo() {
        return supplierInvoiceNo;
    }

    public void setSupplierInvoiceNo(String supplierInvoiceNo) {
        this.supplierInvoiceNo = supplierInvoiceNo;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public List<String> getItemCodes() {
        return itemCodes;
    }

    public void setItemCodes(List<String> itemCodes) {
        this.itemCodes = itemCodes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<String> getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(List<String> paymentType) {
        this.paymentType = paymentType;
    }
}
