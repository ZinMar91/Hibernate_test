package h09.action;

import com.opensymphony.xwork2.ActionSupport;
import h09.entity.H09_LineItem;
import h09.service.DBOperation;

public class ItemAction extends ActionSupport {

    private H09_LineItem item;
    private int itno;
    private DBOperation dbo = new DBOperation();

    public int getItno() {
        return itno;
    }

    public void setItno(int itno) {
        this.itno = itno;
    }

    public H09_LineItem getItem() {
        return item;
    }

    public void setItem(H09_LineItem item) {
        this.item = item;
    }

    public String insertIt() {
        if (dbo.insertItem(item)) {
            //	item.getOrder().saveOrder(item);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String retrieveIt() {
        item = dbo.retrieveItem(itno);
        if (item != null) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
