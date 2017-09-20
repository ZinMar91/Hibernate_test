package h02.entity;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class LineItem implements Serializable{
	private int id;
	private String name;
	private Orders order;
		
	
	@Id
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
	@ManyToOne
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	

}
