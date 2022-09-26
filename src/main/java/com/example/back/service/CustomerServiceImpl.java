package com.example.back.service;

import com.example.back.entities.Customers;
import com.example.back.repository.CustomersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomersService{
    CustomersRepository repository;
    private final Logger log= LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl(CustomersRepository repository) {
        this.repository = repository;
    }


    public List<Customers> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Customers> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Long count() {
        return this.repository.count();
    }

    @Override
    public Customers save(Customers customers) {
        if(!validarCustomer(customers)){
            return null;
        }
        Customers customersDB =this.repository.save(customers);
        return customersDB;
    }

    @Override
    public void deleteById(Long id) {
        if(id==null || id<=0){
            log.error("identificacdor inválido");
            return;

        }
        try{
            this.repository.findById(id);

        }catch (Exception e){
            log.error("operacion fallida");
        }
    }

    @Override
    public void deleteAll() {
        log.info("borando clinetentes");
        this.repository.deleteAll();
    }

    @Override
    public void deleteAll(List<Customers> customers) {
        log.info("borrando por lista de objetos");
        if(CollectionUtils.isEmpty(customers)){
            log.error("lista vacia");
            return;
        }
        this.repository.deleteAll(customers);
    }

    @Override
    public void deleteAllById(List<Long> ids) {
    log.info("borrando datos por lista de id");

    if (CollectionUtils.isEmpty(ids)){
        log.error("lista vacia");
        return;
    }

    this.repository.deleteAllById(ids);
    }

    private boolean validarCustomer(Customers c){
        if(c==null){
            return false;
        }
        if(c.getPostalCode()==null){
            return false;
        }
        return true;
    }

    @Override
    public List<Customers> findByCompany(String companyName) {
        //return this.repository.findByCompanyName(companyName);
        return null;
    }

    @Override
    public List<Customers> findByContactName(String contactName) {
        return null;
    }

    @Override
    public List<Customers> findByCity(String city) {
        return null;
    }

    @Override
    public List<Customers> findByRegion(String region) {
        return null;
    }

    @Override
    public List<Customers> findByCountry(String country) {
        return null;
    }
}
