/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h08.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
@Entity
public class H08_Customer implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String cpassword;
    private Set<H08_Phone> phones = new HashSet<H08_Phone>();

    public H08_Customer() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    public String getCpassword() {
        return cpassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
    
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public Set<H08_Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<H08_Phone> phones) {
        this.phones = phones;
    }

    public void addPhone(H08_Phone ph) {
        phones.add(ph);

    }

    public void removePhone(H08_Phone ph) {
        phones.remove(ph);

    }

}
