package com.example.librawherey1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "schools")

public class Schools {
    @Id
    private Long id;
    String name;
    String city;
    String street;
    String opening_hours;
    String phone;
    Integer lat;
    Integer lon;

    public Schools() {
    }

    public Schools(Long id, String name, String city, String street, String opening_hours, String phone, Integer lat, Integer lon) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.opening_hours = opening_hours;
        this.phone = phone;
        this.lat = lat;
        this.lon = lon;
    }

}
