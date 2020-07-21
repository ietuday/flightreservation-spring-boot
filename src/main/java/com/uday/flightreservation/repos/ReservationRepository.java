package com.uday.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uday.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
