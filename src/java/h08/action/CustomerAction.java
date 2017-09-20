package h08.action;
import com.opensymphony.xwork2.*;
import h08.entity.H08_Customer;
import h08.entity.H08_Phone;
import h08.service.CustomerDAOImpl;
public class CustomerAction extends ActionSupport{
	private H08_Customer c,mc;
	private int cno;
	private String pno;	
	private H08_Phone p;
	//private String customer_phone;
	CustomerDAOImpl dao=new CustomerDAOImpl();
	
	public H08_Customer getC() {
		return c;
	}
	public H08_Customer getMc() {
		return mc;
	}
	public void setMc(H08_Customer mc) {
		this.mc = mc;
	}
	public void setC(H08_Customer c) {
		this.c = c;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}	
	public H08_Phone getP() {
		return p;
	}
	public void setP(H08_Phone p) {
		this.p = p;
	}
	public String insert(){		
	//Phone ph=dao.RetrievePhone(customer_phone);
		c.addPhone(p);
         // c.addPhone(ph);
	  //   ph.addCustomer(c);
		dao.Save(c);
		return SUCCESS;
		
		
	}
 public String insertPhone(){		
		
		dao.SavePhone(p);
		return SUCCESS;
	}
	
	public String retrieve(){
		 mc=dao.Retrieve(cno);
		return SUCCESS;
	}
	public String retrievePhone(){
		 p=dao.RetrievePhone(pno);
		return SUCCESS;
	}
	
	
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	
}
