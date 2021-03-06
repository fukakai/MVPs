package fr.dalichamp.romain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class aUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String firstname;
    public String lastname;

    @Override
    public String toString() {
        return "Firstname: "+this.firstname+" - Lastname: "+lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
