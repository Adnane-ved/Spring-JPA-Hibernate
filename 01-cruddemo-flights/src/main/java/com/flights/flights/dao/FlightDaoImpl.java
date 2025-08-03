package com.flights.flights.dao;

import com.flights.flights.Flights;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class FlightDaoImpl implements FlightDao{

    private EntityManager entitymanager;

    @Autowired
    public FlightDaoImpl(EntityManager entitymanager){
        this.entitymanager = entitymanager;
    }

    @Override
    @Transactional
    public void save(Flights flight){
        entitymanager.persist(flight);
    }

    @Override
    public Flights findById(int id){
        return entitymanager.find(Flights.class,id);
    }

    @Override
    public List<Flights> findAll(){
        return entitymanager.createQuery("from Flights",Flights.class).getResultList();
    }

}
