package com.product.product.dao;

import com.product.product.Products;

import java.util.List;

public interface Productdao {
    public void save(Products products);
    public Products findById(Integer id);
    public List<Products> findAll();
    public List<Products> findByLastName(String lastName);
    public void update(Products product);
    public void updateByLastName(String lastName);

}
