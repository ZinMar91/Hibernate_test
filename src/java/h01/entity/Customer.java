package h01.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="CustomerInfo")
@SecondaryTable(name="CustomerInfoDetail")

public class Customer implements Serializable {
	
	private Integer id;
	private String name;	
	private String address;	
	private int creditscore;	
	private int rewardpoints;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(table="CustomerInfoDetail")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(table="CustomerInfoDetail")
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	
	@Column(table="CustomerInfoDetail")
	public int getRewardpoints() {
		return rewardpoints;
	}
	public void setRewardpoints(int rewardpoints) {
		this.rewardpoints = rewardpoints;
	}

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", creditscore=" + creditscore + ", rewardpoints=" + rewardpoints + '}';
    }

}
