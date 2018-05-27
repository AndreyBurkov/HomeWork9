package com.netcracker.controller;

import com.netcracker.entity.Buyer;
import com.netcracker.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class BuyerRestController {

    @Autowired
    public BuyerService service;

    @GetMapping(value = "/buyer", produces = "application/json")
    public ResponseEntity<List<Buyer>> addNewContact(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/buyer/{id}", produces = "application/json")
    public ResponseEntity<Buyer> getById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/buyer", consumes = "application/json")
    public ResponseEntity<Void> addBuyer(@RequestBody Buyer buyer) {
        service.add(buyer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/buyer")
    public ResponseEntity<Void> deleteAll() {
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/buyer/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}