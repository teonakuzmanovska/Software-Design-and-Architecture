package com.example.librawherey1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "libraries")
public class Libraries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    String city;
    String street;
    String opening_hours;
    String phone;
    Integer lat;
    Integer lon;

    public Libraries() {
    }

    public Libraries(Long id, String name, String city, String street, String opening_hours, String phone, Integer lat, Integer lon) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.opening_hours = opening_hours;
        this.phone = phone;
        this.lat = lat;
        this.lon = lon;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getOpening_hours() {
        return opening_hours;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getLat() {
        return lat;
    }

    public Integer getLon() {
        return lon;
    }
}