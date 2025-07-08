package com.pos.customer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customers")
public class Customer {
    @Id
    @Field("_id")
    private String customer_code;

    @NotBlank(message = "Name is required")
    private String name;

    private String address;

    @Pattern(regexp = "^\\d{10}$", message = "Contact must be a 10-digit number")
    private String contact;

    private String customer_group;

    // Constructors
    public Customer() {}

    public Customer(String customer_code, String name, String address, String contact, String customer_group) {
        this.customer_code = customer_code;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.customer_group = customer_group;
    }

    // Getters and Setters
    public String getCustomer_code() { return customer_code; }
    public void setCustomer_code(String customer_code) { this.customer_code = customer_code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getCustomer_group() { return customer_group; }
    public void setCustomer_group(String customer_group) { this.customer_group = customer_group; }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_code='" + customer_code + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", customer_group='" + customer_group + '\'' +
                '}';
    }
}
