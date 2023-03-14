package com.example.favouriteclothingstore.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name= "dispatchRider-tbl")
public class DispatchRider extends Person{

    private String location;
    private String userRating;
    private String bikeNumber;
    private boolean isAvailable;


}
