package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void addCustomer(CustometTO cto) {

        String sql = "insert into customers values(?,?,?,?,?)";
        jdbcTemplate.update(sql,cto.getCid(), cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());

    }

    public void updateCustomer(CustometTO cto) {

        String sql ="update customers set cname=?, email=?,phone=?, city =? where cid=?";
        jdbcTemplate.update(sql,cto.getCname(),cto.getEmail(),cto.getCity(),cto.getPhone(),cto.getCid());

    }

    public void deleteCustomer(int cid) {

        String sql = "delete from customers where cid =?";
        jdbcTemplate.update(sql,cid);

    }
}
