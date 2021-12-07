package net.javaguides.springboot.Airport;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Airport;
import net.javaguides.springboot.repository.AirportRepository;
import net.javaguides.springboot.service.AirportService;

@RestController
@RequestMapping("/airport")

public class AirportController {
	@Autowired
	private AirportRepository repository;
	@Autowired
	private AirportService airportService;
	@RequestMapping("/service")
	public List<Airport> getAirport() {
	return airportService.getAllAirports();
	}
	@RequestMapping(method=RequestMethod.POST, value="/service")
	public void addAirport(@RequestBody Airport airport ) {
	airportService.addAirport(airport);
	} @RequestMapping(method=RequestMethod.PUT, value="/service/{airportCode}")
	public void updateAirport(@RequestBody Airport airport, @PathVariable String airportCode) {
	airportService.updateAirport(airportCode, airport);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/service/{airportCode}")
	public void deleteAirport( @PathVariable String airportCode) {
	airportService.deleteAirport(airportCode);
	}
	}

