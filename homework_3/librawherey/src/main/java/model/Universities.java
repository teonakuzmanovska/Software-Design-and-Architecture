package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "universities")

public class Universities {

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

    public Universities() {
    }

    public Universities(Long id, String name, String city, String street, String opening_hours, String phone, Integer lat, Integer lon) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.opening_hours = opening_hours;
        this.phone = phone;
        this.lat = lat;
        this.lon = lon;
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
