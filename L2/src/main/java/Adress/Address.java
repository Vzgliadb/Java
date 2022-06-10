package Adress;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonAutoDetect
public class Address {

    public Address() {
    }

    @Override
    public String toString() {
        return "Address.Address{" +
                "country=" + country +
                ", city=" + city +
                ", street=" + street +
                ", house=" + house +
                ", floor=" + floor +
                ", apart='" + apart + '\'' +
                '}';
    }

    @JsonIgnore
    public String country;
    public String city;
    public String street;
    public int house;
    public int floor;
    public int apart;


    public Address(String country, String city, String street, int house, int floor, int apart) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.floor = floor;
        this.apart = apart;
    }
}
