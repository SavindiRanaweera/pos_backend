package com.pos.customer.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
