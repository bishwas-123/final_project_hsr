package com.hsr.demo.application.service;

import com.hsr.demo.application.model.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> findAll();
    Reservation save(Reservation reservation);
    Reservation findById(Integer reservationId);
}
