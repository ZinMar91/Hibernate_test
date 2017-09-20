package h11.action;

import com.opensymphony.xwork2.ActionSupport;
import h11.entity.H11_Mother;
import h11.service.DAOImpl;

public class MotherAction extends ActionSupport {

    private H11_Mother mother, mo;

    public H11_Mother getMo() {
        return mo;
    }

    public void setMo(H11_Mother mo) {
        this.mo = mo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;

    public H11_Mother getMother() {
        return mother;
    }

    public void setMother(H11_Mother mother) {
        this.mother = mother;
    }
    DAOImpl dao = new DAOImpl();

    public String insertmother() {
        dao.savemother(mother);
        return SUCCESS;
    }

    public String retrievemother() {
        mo = dao.retrievemother(id);
        return SUCCESS;
    }
}
