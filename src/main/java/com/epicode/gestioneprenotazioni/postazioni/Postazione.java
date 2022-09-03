package com.epicode.gestioneprenotazioni.postazioni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.epicode.gestioneprenotazioni.edificio.Edificio;
import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazione;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Postazione {
	@Id
	private Integer codUnivoco;
	private String descrizione;
	private TipoPostazione tipo;
	private Integer numOccupanti;
	@ManyToOne
	private Edificio edificio;
	
	@OneToMany
	List<Prenotazione> listPrenotazioni = new ArrayList<>();
	
	public Postazione(Integer codUnivoco, String descrizione, TipoPostazione tipo, Integer numOccupanti) {
		super();
		this.codUnivoco = codUnivoco;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numOccupanti = numOccupanti;
	//	this.edificio = edificio;
	}

	
	public void aggiungiPrenotazione(Prenotazione pren) {
		listPrenotazioni.add(pren);
	}
}
