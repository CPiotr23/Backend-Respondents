package com.example.demo.Entities;



import javax.persistence.*;

@Entity
@Table(name="Respondents")
public class Respondents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="gender")
    private String gender;
    @Column(name="age")
    private int age;
    @Column(name="income")
    private double income;
    @Column(name="kids")
    private int kids;
    @Column(name="ownHome")
    private String ownHome;
    @Column(name="subscribe")
    private String subscribe;
    @Column(name="segment")
    private String segment;

    public Respondents() {}

    public Respondents(int age, String gender, double income, int kids, String ownHome, String subscribe, String segment) {
        this.gender = gender;
        this.age = age;
        this.income = income;
        this.kids = kids;
        this.ownHome = ownHome;
        this.subscribe = subscribe;
        this.segment = segment;
    }

    public Respondents(int id, int age, String gender, double income, int kids, String ownHome, String subscribe, String segment) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.income = income;
        this.kids = kids;
        this.ownHome = ownHome;
        this.subscribe = subscribe;
        this.segment = segment;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getOwnHome() {
        return ownHome;
    }

    public void setOwnHome(String ownHome) {
        this.ownHome = ownHome;
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return  "{id=" + id +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", kids=" + kids +
                ", ownHome='" + ownHome + '\'' +
                ", subscribe='" + subscribe + '\'' +
                ", segment='" + segment + '\'' + "}";
    }
}
