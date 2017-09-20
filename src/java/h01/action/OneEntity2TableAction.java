package h01.action;

import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
import h01.dao.CustomerDAOImpl;
import h01.entity.Customer;

public class OneEntity2TableAction extends ActionSupport {
		
	private Customer customer,cust;
	private CustomerDAOImpl dao=new CustomerDAOImpl();
	private int cno;
	
	
	
	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}	
	
	public String execute() throws Exception{
            System.out.println("Customer: " + customer.toString());
		if(dao.save(customer))
		{		
			
			return SUCCESS;
		}
			
			else return ERROR;		
	}

	
	public String search() throws Exception{		
		cust=dao.search(cno);
		if(cust!=null) 
			return SUCCESS;
		else 
			return ERROR;
	}
	
	
	
}
