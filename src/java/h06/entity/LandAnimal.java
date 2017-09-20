package h06.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("Land_Animal")
public class LandAnimal extends Animal implements Serializable {

    protected int legCount;

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

}
