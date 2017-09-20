package h07.action;

import com.opensymphony.xwork2.*;
import h07.entity.Customer;
import h07.entity.Person;
import h07.service.PersonDAOImpl;

public class PersonAction extends ActionSupport {

    private Person p;
    private Customer c;
    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
    private int cid;

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }
    private int pno;
    private Person per;

    public Customer getCer() {
        return cer;
    }

    public void setCer(Customer cer) {
        this.cer = cer;
    }
    private Customer cer;
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
        dao.savePerson(p, c);
        return SUCCESS;
    }

    public String retrievePerson() {
        per = dao.retrievePerson(pid);
        cer = dao.retrieveCustomer(cid);
        return SUCCESS;
    }
}
