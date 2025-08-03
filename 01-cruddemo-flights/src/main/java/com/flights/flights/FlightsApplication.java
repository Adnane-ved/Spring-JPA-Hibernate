package com.flights.flights;

import com.flights.flights.dao.FlightDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandlinerunner(FlightDao flightdao){
        return running ->{
			createFlight(flightdao);
			allFlights(flightdao);
		};
	}

	public void createFlight(FlightDao flightdao){
		// creating object
		Flights flight = new Flights("Paris");
		System.out.println("Object flight created !!");
		//saving Object to Data Base
		flightdao.save(flight);
		Flights flight1 =  flightdao.findById(flight.getId());
		System.out.println(flight1);

	}

	public void allFlights(FlightDao flightdao){
		for(Flights a :  flightdao.findAll()){
			System.out.println(a);
		}
	}

}
