package com.example.banque_service;

import com.example.banque_service.entities.Compte;
import com.example.banque_service.entities.TypeCompte;
import com.example.banque_service.entities.TypeTransaction;
import com.example.banque_service.repositories.CompteRepository;
import com.example.banque_service.repositories.TransactionRepository;

import org.hibernate.Transaction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BanqueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository,TransactionRepository transactionRepository) {
		return args -> {
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));

			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());


				transactionRepository.save(new Transaction(null, Math.random() * 9000, new Date(), TypeTransaction.DEPOT,compte1));
				transactionRepository.save(new Transaction(null, Math.random() * 9000, new Date(), TypeTransaction.RETRAIT,compte2));
				transactionRepository.save(new Transaction(null, Math.random() * 9000, new Date(), TypeTransaction.RETRAIT,compte3));


			});
		};
	}}
