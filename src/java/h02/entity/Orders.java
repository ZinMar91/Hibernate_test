package h02.entity;
import javax.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="OrderTable")
public class Orders implements Serializable{
	private int oid;
	private String address;
	private List<LineItem> items=new ArrayList<LineItem>();
	
	@Id
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	
	public String getAddress() {
		return address;
	}
	@OneToMany(mappedBy="order")
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	public void setAddress(String address) {
		this.address = address;
	}		

}
