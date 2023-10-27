package com.example.HotelManagementSystemApplication.service;

import com.example.HotelManagementSystemApplication.model.Room;
import com.example.HotelManagementSystemApplication.model.Type;
import com.example.HotelManagementSystemApplication.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    RoomRepo repo;

    public String addRoom(Room my) {
        repo.save(my);
        return "Added";
    }

    public String multipleRoomsAdd(List<Room> my) {
        repo.saveAll(my);
        return "Multiple added";
    }

    public List<Room> getAllRooms() {
        return (List<Room>) repo.findAll();
    }

    public String deleteAllRooms() {
        repo.deleteAll();
        return "delete";
    }

    public String deleteAllRoomsById(List<Integer> id) {
        repo.deleteAllById(id);
        return "delete";
    }

    public String deleteRoomById(Integer id) {
        repo.deleteById(id);
        return "delete";
    }

    public Long getAllRoomsCount() {
        return repo.count();
    }


    public Room findByRoomPrice(Integer price) {
        return repo.findByRoomPrice(price);
    }

    public List<Room> findAllByAvailableRooms(Type roomType) {
        return repo.findByRoomTypeAndRoomAvailable(roomType,true);
    }

    public List<Room> getAllRoomsByPriceAndType(Type roomType, Integer roomPrice) {
        return repo.findByRoomTypeAndRoomPriceLessThanEqual(roomType,roomPrice);
    }

    public List<Room> getAllRoomsByTypeAndPrice(Type roomType, Integer roomPrice) {
        return repo.findByRoomTypeAndRoomPriceGreaterThanEqual(roomType,roomPrice);
    }


    public List<Room> getAllRoomsByOrder(Type roomType,boolean roomAvailable) {
        return repo.findByRoomTypeAndRoomAvailableOrderByRoomPrice(roomType,roomAvailable);
    }

    public String name() {
        return "aniket";
    }
}
