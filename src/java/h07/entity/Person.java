package h07.entity;

import java.io.Serializable;

import javax.persistence.*;
 
@Entity@Table(name = "h07_person")
public class Person implements Serializable {
    
    int id;
    private String name;   
    
    private Address address;
 
    public Person() {
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
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
}
