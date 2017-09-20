package h06.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.servlet.DispatcherType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="DIS_Type")
@DiscriminatorValue("Animal")
public class Animal implements Serializable {

    protected int id;
    protected String name;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
