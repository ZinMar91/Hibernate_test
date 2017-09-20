package h02.action;
import com.opensymphony.xwork2.ActionSupport;
import h02.entity.Orders;
import h02.service.DBOperation;

public class OrderAction extends ActionSupport{
	private Orders order;
	private int odno;
	private DBOperation dbo=new DBOperation();
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
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
		else return ERROR;
	}
	
	public String retrieve(){
		order=dbo.retrieveOrder(odno);
		if(order!=null) return SUCCESS;
		else return ERROR;
	}
	}

