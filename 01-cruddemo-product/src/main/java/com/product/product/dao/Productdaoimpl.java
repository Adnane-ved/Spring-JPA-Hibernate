package com.product.product.dao;

import com.product.product.Products;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class Productdaoimpl implements Productdao {

    private EntityManager entitymanager;

    @Autowired
    public Productdaoimpl(EntityManager entitymanager) {
        this.entitymanager = entitymanager;
    }

    @Override
    @Transactional
    public void save(Products product){
        entitymanager.persist(product);
    }

    @Override
    public Products findById(Integer id){
        return entitymanager.find(Products.class,id);
    }

    @Override
    public List<Products> findAll(){
        return entitymanager.createQuery("From Products",Products.class).getResultList();
    }

    @Override
    public List<Products> findByLastName(String lastName){
         return entitymanager.createQuery("From Products where name = :data",Products.class).setParameter("data",lastName).getResultList();
    }

    @Override
    @Transactional
    public void update(Products product){
        entitymanager.merge(product);
    }

    @Override
    @Transactional
    public void updateByLastName(String lastName){
        entitymanager.createQuery("UPDATE Products SET name = 'tonik' where name = :data ").setParameter("data",lastName).executeUpdate();
    }

}
