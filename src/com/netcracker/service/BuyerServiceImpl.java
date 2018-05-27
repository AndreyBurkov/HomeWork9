package com.netcracker.service;

import com.netcracker.dao.BuyerDAO;
import com.netcracker.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    public BuyerDAO buyerDAO;

    @Override
    public List<Buyer> getAll() {
        return buyerDAO.getAll();
    }

    @Override
    public Buyer getById(Integer id) {
        return buyerDAO.getById(id);
    }

    @Override
    public void add(Buyer buyer) {
        buyerDAO.add(buyer);
    }

    @Override
    public void delete(Integer id) {
        buyerDAO.delete(id);
    }

    @Override
    public void deleteAll() {
        buyerDAO.deleteAll();
    }
}
