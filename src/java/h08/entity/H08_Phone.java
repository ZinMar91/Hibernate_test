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

/**
 *
 * @author Admin
 */
@Entity
public class H08_Phone implements Serializable {

    private String pno;
    private String pname;
    private Set<H08_Customer> cust = new HashSet<H08_Customer>();

    @Id
    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    @ManyToMany(mappedBy = "phones", fetch = FetchType.EAGER)
    public Set<H08_Customer> getCust() {
        return cust;
    }

    public void setCust(Set<H08_Customer> cust) {
        this.cust = cust;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void addCustomer(H08_Customer c) {
        cust.add(c);

    }

    public void removeCustomer(H08_Customer c) {
        cust.remove(c);

    }
}
