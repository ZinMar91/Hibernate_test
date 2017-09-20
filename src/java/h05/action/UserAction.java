package h05.action;
import com.opensymphony.xwork2.ActionSupport;
import h05.entity.*;
import h05.service.DBOperation;

public class UserAction extends ActionSupport{
	
	private UserTwo user;
	private int uno;	
	
	private String street1;
	private String city1;
	private String state1;
	
	private String street2;
	private String city2;
	private String state2;
	
	private DBOperation dbo=new DBOperation();
	
	public UserTwo getUser() {
		return user;
	}

	public void setUser(UserTwo user) {
		this.user = user;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}	

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getCity1() {
		return city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity2() {
		return city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String insertUser(){
		if(!street1.trim().equals("")||!city1.trim().equals("")||!state1.trim().equals(""))
			user.getAddress().add(new Address(street1,city1,state1));
		if(!street2.trim().equals("")||!city2.trim().equals("")||!state2.trim().equals(""))
			user.getAddress().add(new Address(street2,city2,state2));
		if(dbo.insertUser(user))
		return SUCCESS;
		else return ERROR;
		
	}
	
	public String retrieveUser(){
		user=dbo.retrieveUser(uno);
		if(user!=null) {		
			
			return SUCCESS;
		}
		return ERROR;
	}



	
	}

