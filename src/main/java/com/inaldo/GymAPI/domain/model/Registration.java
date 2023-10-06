package com.inaldo.GymAPI.domain.model;

import jakarta.persistence.*;

@Entity(name = "table-registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String registration;
    private String filial;

    //geters & setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationId() {
        return registration;
    }

    public void setNumber(String number) {
        this.registration = number;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }
}
