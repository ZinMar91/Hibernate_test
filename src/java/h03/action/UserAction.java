package h03.action;
import com.opensymphony.xwork2.ActionSupport;
import h03.service.DBOperation;
import h03.entity.UserOne;

public class UserAction extends ActionSupport{
	
	private UserOne user;	
	private int uno;	
	private DBOperation dbo=new DBOperation();
	private String nick1;
	private String nick2;
	private String nick3;
	
	public UserOne getUser() {
		return user;
	}

	public void setUser(UserOne user) {
		this.user = user;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}
	
	
	public String getNick1() {
		return nick1;
	}

	public void setNick1(String nick1) {
		this.nick1 = nick1;
	}

	public String getNick2() {
		return nick2;
	}

	public void setNick2(String nick2) {
		this.nick2 = nick2;
	}

	public String getNick3() {
		return nick3;
	}

	public void setNick3(String nick3) {
		this.nick3 = nick3;
	}

	public String insertUser(){
		if(!nick1.trim().equals(""))user.getNickNames().add(nick1);
		if(!nick2.trim().equals(""))user.getNickNames().add(nick2);
		if(!nick3.trim().equals(""))user.getNickNames().add(nick3);
		System.out.println(user.getNickNames());
		if(dbo.insertUser(user))
		return SUCCESS;
		else return ERROR;
		
	}
	
	public String retrieveUser(){
		user=dbo.retrieveUser(uno);
		if(user!=null) return SUCCESS;
		return ERROR;
	}



	
	}

