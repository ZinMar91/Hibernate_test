package h02.action;
import com.opensymphony.xwork2.ActionSupport;
import h02.entity.LineItem;
import h02.service.DBOperation;
public class ItemAction extends ActionSupport{
	
 private LineItem item;
 private int itno;
 private DBOperation dbo=new DBOperation();

public int getItno() {
	return itno;
}

public void setItno(int itno) {
	this.itno = itno;
}

public LineItem getItem() {
	return item;
}

public void setItem(LineItem item) {
	this.item = item;
}

public String insertIt(){
	if(dbo.insertItem(item)){	
	return SUCCESS;
	}
	else return ERROR;
}

public String retrieveIt(){
	item=dbo.retrieveItem(itno);
	if(item!=null) return SUCCESS;
	else return ERROR;
}
 
 
}
