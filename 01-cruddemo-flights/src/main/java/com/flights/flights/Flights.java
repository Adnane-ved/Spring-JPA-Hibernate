package com.flights.flights;

import jakarta.persistence.*;

@Entity
@Table(name = "flight")
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="destination")
    private String destination;

    public Flights(){}

    public Flights(String destination){
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                '}';
    }
}
