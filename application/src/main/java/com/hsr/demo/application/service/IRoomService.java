package com.hsr.demo.application.service;


import com.hsr.demo.application.model.Room;

import java.util.List;

public interface IRoomService {
    List<Room> findAll();
    Room save(Room room);
    Room findById(Integer roomId);
}
