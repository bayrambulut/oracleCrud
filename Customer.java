package com.task.sample.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "SCHEMA_NAME" ,name = "CUSTOMER_TABLE")
public class Customer {

    // "customer_seq" is Oracle sequence name.
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "DGARYSRSTG.SEQ_CUSTOMER_TABLE", allocationSize = 1, name = "CUST_SEQ")
    Long id;

    String name;

    String email;

    @Column(name = "CREATED_DATE")
    Date date;

    public Customer() {

    }

    public Customer(Long id, String name, String email, Date date) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;

    }

    public Customer(String name, String email, Date date) {

        this.name = name;
        this.email = email;
        this.date = date;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}