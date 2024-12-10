package com.example.banque_service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
    public class Transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)


        private Long id;
        private double montant;

        @Temporal(TemporalType.TIMESTAMP)
        private Date date;

        @Enumerated(EnumType.STRING)
        private TypeTransaction type;

        @ManyToOne
        @JoinColumn(name = "compte_id")
        private Compte compte;



    }

