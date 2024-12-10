package com.example.banque_service.dto;

import com.example.banque_service.entities.TypeTransaction;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class TransactionRequest {

        private Long compteId;
        private double montant;

        @Temporal(TemporalType.TIMESTAMP)
        private Date date;

        @Enumerated(EnumType.STRING)
        private TypeTransaction type;

    }


