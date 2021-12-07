package net.javaguides.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.javaguides.springboot.model.Airport;

public interface AirportRepository extends MongoRepository <Airport, String>{

}
