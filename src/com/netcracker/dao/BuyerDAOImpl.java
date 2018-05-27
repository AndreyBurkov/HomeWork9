package com.netcracker.dao;

import com.netcracker.entity.Buyer;
import com.netcracker.mapper.BuyerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuyerDAOImpl implements BuyerDAO {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<Buyer> getAll() {
        String sql = "SELECT * FROM buyer";
        return jdbcTemplate.query(sql, new BuyerMapper());
    }

    @Override
    public Buyer getById(Integer id) {
        String sql = "SELECT * FROM buyer WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BuyerMapper(), id);
    }

    @Override
    public void add(Buyer buyer) {
        String sql = "INSERT INTO buyer(lastname, address, discount) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, buyer.getLastname(), buyer.getAddress(), buyer.getDiscount());
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM buyer WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM buyer";
        jdbcTemplate.update(sql);
    }
}
