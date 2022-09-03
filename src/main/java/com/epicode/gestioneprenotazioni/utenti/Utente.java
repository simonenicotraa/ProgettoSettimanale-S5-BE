package com.epicode.gestioneprenotazioni.utenti;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazione;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String nomeCompleto;
	private String email;
	@OneToMany
	List<Prenotazione> listaPrenotazione = new ArrayList<Prenotazione>();
	public Utente(String username, String nomeCompleto, String email) {
		super();
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
	public void aggiungiPrenotazione(Prenotazione p) {
		listaPrenotazione.add(p);
	}
}
