package com.sda;


import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

//@NamedQueries({
//        @NamedQuery(name = "findUsersName",
//        query = "SELECT username FROM User")
//})


@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "username")
    private String username;


    @Temporal(TemporalType.DATE)
    @Column(name = "registerDate")
    private Date registerDate;

    @Enumerated(EnumType.STRING)
    private Status status;


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User() {
    }


    public Long getId() {
        return id;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return getUsername();
    }
}
