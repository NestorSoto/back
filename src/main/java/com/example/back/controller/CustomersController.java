package com.example.back.controller;

import com.example.back.entities.Customers;
import com.example.back.service.CustomersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomersController {
    private CustomersService customersService;
    public static Logger log = LoggerFactory.getLogger(CustomersController.class);

    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }
    @GetMapping("/customers")
    public List<Customers> findAll(){
        return this.customersService.findAll();
    }
    @GetMapping("/customers/{id}")
    public ResponseEntity<Customers> findById(@PathVariable long id){
        Optional<Customers> customersOpt=this.customersService.findById(id);
        if(customersOpt.isPresent()){
            return ResponseEntity.ok(customersOpt.get());
        }
        return ResponseEntity.notFound().build();
    }
    //save customer
    @PostMapping("/customers")
    public ResponseEntity<Customers> create(@RequestBody Customers c){
        if(c.getCustomerId()!=null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(this.customersService.save(c));
    }
    @GetMapping("/customers/count")
    public ResponseEntity<Long> count(){
        Long count= this.customersService.count();
        return ResponseEntity.ok(count);
    }
    @PutMapping("/customers")
    public ResponseEntity<Customers> update(@RequestBody Customers customers){
        if(customers.getCustomerId()==null){
            //si no tiene id no se puede actualizar
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(this.customersService.save(customers));
    }
    @GetMapping("/customers/companyname/{companyname}")
    public List<Customers> findByCompanyName(@PathVariable String companyName){
        return this.customersService.findByContactName(companyName);
    }
    //delete by id
    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Customers> delete (@PathVariable long id){
        log.info("borrando por id");
        this.customersService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/customers")
    public ResponseEntity<Customers> deleteAll(){
        log.info("Eliminado todos lo registros");
        this.customersService.deleteAll();
        return ResponseEntity.notFound().build();
    }










}
