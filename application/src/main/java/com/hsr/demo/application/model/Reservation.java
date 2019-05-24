package com.hsr.demo.application.model;

import javax.persistence.*;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate reservationDate;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer numberOfOccupants;
    private Double amount=0d;
    private Double balance;
    private String confirmationCode;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Room room;

    public Reservation(LocalDate reservationDate, LocalDate checkinDate, LocalDate checkoutDate, Integer numberOfOccupants, Double amount, Double balance, String confirmationCode) {
        this.reservationDate = reservationDate;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.numberOfOccupants = numberOfOccupants;
        this.amount = amount;
        this.balance = balance;
        this.confirmationCode = confirmationCode;
    }

    public Reservation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(LocalDate checkinDate) {
        this.checkinDate = checkinDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Integer getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(Integer numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getConfirmationCode() {
        return confirmationCode;
    }

    public String setConfirmationCode() {
        this.confirmationCode = "hsr"+Math.random()*(98765432)+23456789;
        return getConfirmationCode();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public double calculateAmount(){
        long daysBetween = DAYS.between(checkinDate, checkoutDate);
        if(room.getRoomType().equalsIgnoreCase("Suits"))
            this.amount=(double)daysBetween*120;
        if(room.getRoomType().equalsIgnoreCase("Double"))
            this.amount=(double)daysBetween*100;
        if(room.getRoomType().equalsIgnoreCase("Single"))
            this.amount=(double)daysBetween*80;
        return getAmount();
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

}
