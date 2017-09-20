package h07.entity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.xml.ws.soap.Addressing;

@Entity@Table(name = "h07_customer")
public class Customer implements Serializable {

    int id;
    private String name;

    private Address address;

    public Customer() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Embedded

    @AttributeOverrides({
        @AttributeOverride(name = "streetAddress", column = @Column(name = "Address"))})
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
