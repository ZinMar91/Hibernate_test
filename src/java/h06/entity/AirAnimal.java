package h06.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("Air_Animal")
public class AirAnimal extends Animal implements Serializable {

    protected int wingSpan;

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}
