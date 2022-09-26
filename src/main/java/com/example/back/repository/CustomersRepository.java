package com.example.back.repository;

import com.example.back.entities.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository  extends JpaRepository<Customers, Long> {

    //List<Customers> findByCompanyName(String companyName);
    //List<Customers> findByCompanyName(String companyName);
//    List<Customers> findByContactName(String contactName);
//    List<Customers> findByCity(String city);
//    List<Customers> findByRegion(String region);
//    List<Customers> findByCountry(String country);
//    Long deleteAllByCompanyName();
//    Long deleteAllByContactName();
}
