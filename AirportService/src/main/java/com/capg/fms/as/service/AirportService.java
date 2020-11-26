package com.capg.fms.as.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.fms.as.dao.AirportDAO;
import com.capg.fms.as.dto.Airport;
import com.capg.fms.as.exception.AirportNotFoundException;

@Service
public class AirportService {
	@Autowired
	private AirportDAO airportdao;

	public void setAirportdao(AirportDAO airportdao) {
		this.airportdao = airportdao;
	}

//view airport by Id
	@Transactional(readOnly = true)
	public Optional<Airport> getAirport(String airportId) {
		if (!airportdao.existsById(airportId)) {
			throw new AirportNotFoundException();
		} else {
			return airportdao.findById(airportId);
		}
	}

//view airport list
	@Transactional(readOnly = true)
	public List<Airport> getAirports() {
		return airportdao.findAll();
	}

//add airport
	@Transactional
	public Airport addAirport(Airport airport) {
		return airportdao.save(airport);
	}

//update airport by Id
	public String updateAirport(Airport airport) {
		if (airportdao.existsById(airport.getAirportId())) {
			airportdao.save(airport);
			return "airports were updated successfully";
		}

		else {
			throw new AirportNotFoundException();
		}

	}

//delete airport by Id
	@Transactional
	public void deleteAirport(String airportId) {
		if (!airportdao.existsById(airportId)) {
			throw new AirportNotFoundException();
		} else {
			airportdao.deleteById(airportId);
		}
	}
	
}
