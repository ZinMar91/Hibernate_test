package h03.entity;
import javax.persistence.*;
import java.util.*;

@Entity
public class UserOne {
	private int id;
	private String firstName;
	private String lastName;
	private Set<String> nickNames=new HashSet<String>();
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="Nicknames",joinColumns=@JoinColumn(name="user_id"))
	@Column(name="nickname")
	public Set<String> getNickNames() {
		return nickNames;
	}
	public void setNickNames(Set<String> nickNames) {
		this.nickNames = nickNames;
	}
	
	
}
