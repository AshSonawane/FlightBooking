package net.javaguides.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AirportDetails")
public class Airport {
	
	private String airportCode;
	private String airportLocation;
	private String airportName;
	public Airport(String airportCode, String airportLocation, String airportName) {
		super();
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

}
