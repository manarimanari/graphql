package com.example.banque_service.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Compte {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private double solde;

        @Temporal(TemporalType.DATE)
        private Date dateCreation;

        @Enumerated(EnumType.STRING)
        private TypeCompte type;

    @OneToMany
    @JoinColumn(name = "compte")
    private List<Transaction> transactions;

    public Compte(  Long id,double solde,Date dateCreation,TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }
}

