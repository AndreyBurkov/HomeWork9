package com.netcracker.dao;

import com.netcracker.entity.Buyer;

import java.util.List;

public interface BuyerDAO {

    List<Buyer> getAll();

    Buyer getById(Integer id);

    void add(Buyer buyer);

    void delete(Integer id);

    void deleteAll();

}
