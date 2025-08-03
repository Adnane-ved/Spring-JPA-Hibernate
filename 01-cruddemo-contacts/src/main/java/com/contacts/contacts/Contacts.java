package com.contacts.contacts;

import jakarta.persistence.*;

@Entity
@Table(name="contacts")
public class Contacts {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identificateur")
    private String identificateur;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Contacts(){}

    public Contacts(String firstName , String lastName , String identificateur, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificateur = identificateur;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificateur() {
        return identificateur;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdentificateur(String identificateur) {
        this.identificateur = identificateur;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
