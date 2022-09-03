package com.epicode.gestioneprenotazioni.edificio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.postazioni.Postazione;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Edificio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String indirizzo;
	private String citta;
	@OneToMany
	List<Postazione> listaPostazione = new ArrayList<>();

	public Edificio(String nome, String indirizzo, String citta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}

	public void aggiungiPostazione(Postazione p) {
		listaPostazione.add(p);
	}
}
