package com.example.HotelManagementSystemApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {

    @Id
    private Integer roomId;
    private Integer roomNumber;
    private Integer roomPrice;
    private Type roomType;
    private boolean roomAvailable;

}
