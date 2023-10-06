package com.inaldo.GymAPI.domain.model;

import jakarta.persistence.*;

@Entity(name = "table-user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registration;
    private String nome;
    private String endereco;
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private AccessCard accessCard;

    //getrs & setters

    public Long getId() {
        return registration;
    }

    public void setId(Long id) {
        this.registration = registration;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AccessCard getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(AccessCard accessCard) {
        this.accessCard = accessCard;
    }

}
