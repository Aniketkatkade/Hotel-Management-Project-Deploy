package com.example.HotelManagementSystemApplication.repo;

import com.example.HotelManagementSystemApplication.model.Room;
import com.example.HotelManagementSystemApplication.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepo extends CrudRepository<Room,Integer> {
    Room findByRoomPrice(Integer price);



    List<Room> findByRoomTypeAndRoomAvailable(Type roomType, boolean b);

    List<Room> findByRoomTypeAndRoomPriceLessThanEqual(Type roomType, Integer roomPrice);

    List<Room> findByRoomTypeAndRoomPriceGreaterThanEqual(Type roomType, Integer roomPrice);




    List<Room> findByRoomTypeAndRoomAvailableOrderByRoomPrice(Type roomType, boolean roomAvailable);
}
