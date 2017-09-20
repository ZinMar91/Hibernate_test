package h06.action;

import com.opensymphony.xwork2.*;
import h06.entity.AirAnimal;
import h06.entity.Animal;
import h06.entity.LandAnimal;
import h06.service.AnimalDAOImpl;

public class AnimalAction extends ActionSupport {

    private Animal a, result;
    private LandAnimal la;
    private AirAnimal aa;
    private int no;
    private AnimalDAOImpl dao = new AnimalDAOImpl();

    public Animal getA() {
        return a;
    }

    public void setA(Animal a) {
        this.a = a;
    }

    public LandAnimal getLa() {
        return la;
    }

    public void setLa(LandAnimal la) {
        this.la = la;
    }

    public AirAnimal getAa() {
        return aa;
    }

    public void setAa(AirAnimal aa) {
        this.aa = aa;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Animal getResult() {
        return result;
    }

    public void setResult(Animal result) {
        this.result = result;
    }

    public String saveAnimal() {
        dao.saveAnimal(a);
        return SUCCESS;
    }

    public String saveLandAnimal() {
        dao.saveLandAnimal(la);
        return SUCCESS;
    }

    public String saveAirAnimal() {
        dao.savetAirAnimal(aa);
        return SUCCESS;
    }

    public String retrieveAnimal() {
        result = dao.retrieveAnimal(no);
        return SUCCESS;
    }

    public String retrieveLandAnimal() {
        result = dao.retrieveLandAnimal(no);
        return SUCCESS;
    }

    public String retrieveAirAnimal() {
        result = dao.retrieveAirAnimal(no);
        return SUCCESS;
    }

}
