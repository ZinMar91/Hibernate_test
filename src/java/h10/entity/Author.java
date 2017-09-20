package h10.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table( name="authortable")
public class Author implements Serializable{
private Integer id;
private String name;
private Bigrophy biography;
@Id
@GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@OneToOne(mappedBy="author", cascade=CascadeType.ALL)  
public Bigrophy getBiography() {
	return biography;
}
public void setBiography(Bigrophy biography) {
	this.biography = biography;
}
}
