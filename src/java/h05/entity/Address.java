package h05.entity;

import javax.persistence.*;
import java.io.*;

@Embeddable
public class Address implements Serializable {

    private String streetAddress;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String streetAddress, String city, String state) {
        super();
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
