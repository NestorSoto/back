package com.example.back.service;

import com.example.back.entities.Customers;

import java.util.List;
import java.util.Optional;

public interface CustomersService {
        List<Customers> findAll();
        Optional<Customers> findById(Long id);
        Long count();
        Customers save(Customers customers);
        void deleteById(Long id);

        void deleteAll();

        void deleteAll(List<Customers> customers);

        void deleteAllById(List<Long> ids);
        List<Customers>findByCompany(String companyName);
        List<Customers> findByContactName(String contactName);
        List<Customers> findByCity(String city);
        List<Customers> findByRegion(String region);
        List<Customers> findByCountry(String country);

}
