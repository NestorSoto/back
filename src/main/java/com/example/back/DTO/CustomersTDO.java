package com.example.back.DTO;

import com.example.back.entities.Customers;

import java.util.List;

public class CustomersTDO {
    private List<Customers> customers;

    public CustomersTDO(List<Customers> customers) {
        this.customers = customers;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }
}
