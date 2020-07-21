package com.uday.flightreservation.services;

import com.uday.flightreservation.dto.ReservationRequest;
import com.uday.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
