package h11.action;

import com.opensymphony.xwork2.ActionSupport;
import h11.entity.H11_Person;
import h11.service.DAOImpl;

public class PersonAction extends ActionSupport {

    private H11_Person p, per;

    public H11_Person getPer() {
        return per;
    }

    public void setPer(H11_Person per) {
        this.per = per;
    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public H11_Person getP() {
        return p;
    }

    public void setP(H11_Person p) {
        this.p = p;
    }
    DAOImpl dao = new DAOImpl();

    public String insertperson() {
        dao.saveperson(p);
        return SUCCESS;
    }

    public String retrieveperson() {
        per = dao.retrieveperson(id);
        return SUCCESS;
    }
}
