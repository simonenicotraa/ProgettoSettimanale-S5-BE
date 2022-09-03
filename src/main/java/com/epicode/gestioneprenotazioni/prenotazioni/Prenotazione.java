package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.epicode.gestioneprenotazioni.postazioni.Postazione;
import com.epicode.gestioneprenotazioni.utenti.Utente;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Utente utente;
	@ManyToOne
	private Postazione postazione;

	private LocalDate giornoPrenotato;

	public Prenotazione(Postazione postazione, LocalDate giornoPrenotato) {
		super();
		this.postazione = postazione;
		this.giornoPrenotato = giornoPrenotato;
	}

	public Prenotazione(LocalDate giornoPrenotato) {
		super();
		this.giornoPrenotato = giornoPrenotato;
	}
	
	
}
