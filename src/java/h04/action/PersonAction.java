package h04.action;

import com.opensymphony.xwork2.*;
import h04.entity.Person;
import h04.service.PersonDAOImpl;

public class PersonAction extends ActionSupport {

    private Person p;
    private int pno;
    private Person per;
    private PersonDAOImpl dao = new PersonDAOImpl();

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String savePerson() {
        dao.savePerson(p);
        return SUCCESS;
    }

    public String retrievePerson() {
        per = dao.retrievePerson(pno);
        return SUCCESS;
    }
}
