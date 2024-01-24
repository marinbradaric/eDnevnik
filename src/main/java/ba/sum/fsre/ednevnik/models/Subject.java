package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private long id;

    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false) // povezuje predmet s korisnikom
    private User user;


    public Subject(){

    }

    public Subject(String subjectName, User user) {
        this.subjectName = subjectName;
        this.user = user;
    }

    // Getteri i setteri
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
