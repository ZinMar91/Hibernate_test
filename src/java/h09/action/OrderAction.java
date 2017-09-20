package h09.action;
import com.opensymphony.xwork2.ActionSupport;
import h09.entity.H09_Order;
import h09.service.DBOperation;
public class OrderAction extends ActionSupport{
	private H09_Order order;
	private int odno;
	private DBOperation dbo=new DBOperation();
	public H09_Order getOrder() {
		return order;
	}
	public void setOrder(H09_Order order) {
		this.order = order;
	}
	public int getOdno() {
		return odno;
	}
	public void setOdno(int odno) {
		this.odno = odno;
	}
	
	public String insert(){
		if(dbo.insertOrder(order)) return SUCCESS;
		return ERROR;
	}
	
	public String retrieve(){
		order=dbo.retrieveOrder(odno);
		if(order!=null) return SUCCESS;
		return ERROR;
	}
	}

