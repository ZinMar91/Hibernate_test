package h10.action;

import com.opensymphony.xwork2.ActionSupport;
import h10.entity.Author;
import h10.entity.Bigrophy;
import h10.service.DBOImpl;

public class BigrophyAction extends ActionSupport {

    private Author author, author1;
    private boolean b;

    public Author getAuthor1() {
        return author1;
    }

    public void setAuthor1(Author author1) {
        this.author1 = author1;
    }
    private Bigrophy biography;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Bigrophy getBiography() {
        return biography;
    }

    public void setBiography(Bigrophy biography) {
        this.biography = biography;
    }
    DBOImpl d = new DBOImpl();

    public String authorinsert() {
        System.out.println(biography.getInformation());

        author.setBiography(biography);
        System.out.print(author.getName());
        biography.setAuthor(author);
        d.Save(author);
        return SUCCESS;
    }

    public String searchdata() {
        author1 = d.searchdata(id);
        return SUCCESS;
    }

    public String deleteIt() {
        b = d.deleteauthor(id);
        if (b == true) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
