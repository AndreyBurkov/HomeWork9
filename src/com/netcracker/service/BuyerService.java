package com.netcracker.service;

import com.netcracker.entity.Buyer;

import java.util.List;

public interface BuyerService {

    List<Buyer> getAll();

    Buyer getById(Integer id);

    void add(Buyer buyer);

    void delete(Integer id);

    void deleteAll();
}
