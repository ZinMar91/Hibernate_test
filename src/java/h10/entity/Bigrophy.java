package h10.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.mapping.ForeignKey;
@Entity
@Table (name="BigrophyTable")
public class Bigrophy implements Serializable{
private Integer authorid;
private String information;
private Author author;
@Id
@Column (name="author_id") 
@GeneratedValue(generator="gen")  
@GenericGenerator(name="gen", strategy="foreign",   
parameters=@Parameter(name="property", value="author"))
public Integer getAuthorid() {
	return authorid;
}
public void setAuthorid(Integer authorid) {
	this.authorid = authorid;
}
public String getInformation() {
	return information;
}
public void setInformation(String information) {
	this.information = information;
}
@OneToOne  
@PrimaryKeyJoinColumn 
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}

}
