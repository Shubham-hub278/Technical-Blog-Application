package TechnicalBlog.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer id;
    @Column(name="title")
    private String title;
    @Column(name="body")
    private String body;
    @Column(name="date")
    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {

        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setID(Integer id) {
        this.id = id;
    }
    public Integer getID(){ return this.id;
    }
}
