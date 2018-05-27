package com.netcracker.mapper;

import com.netcracker.entity.Buyer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyerMapper implements RowMapper<Buyer> {

    public Buyer mapRow(ResultSet resultSet, int i) throws SQLException {
        Buyer buyer = new Buyer();
        buyer.setId(resultSet.getInt("id"));
        buyer.setLastname(resultSet.getString("lastname"));
        buyer.setAddress(resultSet.getString("address"));
        buyer.setDiscount(resultSet.getInt("discount"));
        return buyer;
    }
}
