package com.flights.flights.dao;

import com.flights.flights.Flights;

import java.util.List;

public interface FlightDao {
    public void save(Flights flight);
    Flights findById(int id);
    List<Flights> findAll();
}
