package com.example.HotelManagementSystemApplication.controller;

import com.example.HotelManagementSystemApplication.model.Room;
import com.example.HotelManagementSystemApplication.model.Type;
import com.example.HotelManagementSystemApplication.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService service;

    @PostMapping("room")
    public String addRoom(@RequestBody Room my){
        return service.addRoom(my);
    }

    @PostMapping("rooms")
    public String multipleRoomAdds(@RequestBody List<Room> my){
        return service.multipleRoomsAdd(my);
    }

    @GetMapping("all/rooms")
    public List<Room> getAllRooms(){
        return service.getAllRooms();
    }

    @DeleteMapping("delete/all/rooms")
    public String deleteAllRooms(){
        return service.deleteAllRooms();
    }

    @DeleteMapping("delete/all/rooms/by/ids")
    public String deleteAllRoomsById(@RequestBody List<Integer> id){
        return service.deleteAllRoomsById(id);
    }

    @DeleteMapping("delete/room/by/id")
    public String deleteRoomById(@RequestParam Integer id){
        return service.deleteRoomById(id);
    }

    @GetMapping("rooms/count")
    public Long getAllRoomsCount(){
        return service.getAllRoomsCount();
    }

    @GetMapping("find/by/room/price/{price}")
    public Room findByRoomPrice(@PathVariable Integer price){
        return service.findByRoomPrice(price);
    }

    @GetMapping("available/rooms/type/Ac")
    public List<Room> findAllByAvailableRooms(@RequestParam Type roomType){
        return service.findAllByAvailableRooms(roomType);
    }

    @GetMapping("available/rooms/type/Ac/and/price/{roomPrice}/lower")
    public List<Room> getAllRoomsByPriceAndType(@RequestParam Type roomType,@PathVariable Integer roomPrice){
        return service.getAllRoomsByPriceAndType(roomType,roomPrice);
    }

    @GetMapping("available/rooms/type/Ac/and/price/{roomPrice}/greater")
    public List<Room> getAllRoomsByTypeAndPrice(@RequestParam Type roomType,@PathVariable Integer roomPrice){
        return service.getAllRoomsByTypeAndPrice(roomType,roomPrice);
    }


    @GetMapping("room/order/by/desc")
    public List<Room> getAllRoomsByOrder(@RequestParam Type roomType,@RequestParam boolean roomAvailable){
        return service.getAllRoomsByOrder(roomType,roomAvailable);
    }

    @GetMapping("aniket")
    public String name(){
        return service.name();
    }

    @GetMapping("virat")
    public String nameC(){
        return service.nameC();
    }

    @GetMapping("rohit")
    public String nameCr(){
        return service.nameCr();
    }









}
