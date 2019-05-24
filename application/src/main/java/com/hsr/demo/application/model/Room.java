package com.hsr.demo.application.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    @NotNull(message = "Room number must be unique and not null")
    private String roomNumber;
    private Double price;
    private String status;
    private String roomType;
    private String bedType;
    @Lob
    private String description;
    private String features;
    private String imageLocation;

    public Room(String roomNumber, Double price, String status, String roomType, String bedType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.status = status;
        this.roomType = roomType;
        this.bedType = bedType;
    }

    public Room() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
