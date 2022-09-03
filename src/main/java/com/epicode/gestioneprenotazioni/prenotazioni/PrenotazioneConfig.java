package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.postazioni.Postazione;
import com.epicode.gestioneprenotazioni.utenti.Utente;

@Configuration
public class PrenotazioneConfig {
	@Autowired
	@Qualifier("deskPriv1")
	Postazione deskPriv1;
	@Autowired
	@Qualifier("deskPriv2")
	Postazione deskPriv2;
	@Autowired
	@Qualifier("deskPriv3")
	Postazione deskPriv3;
	@Autowired
	@Qualifier("deskPriv4")
	Postazione deskPriv4;
	@Autowired
	@Qualifier("deskPriv5")
	Postazione deskPriv5;
	@Autowired
	@Qualifier("deskPriv6")
	Postazione deskPriv6;

	@Autowired
	@Qualifier("deskOpen1")
	Postazione deskOpen1;
	@Autowired
	@Qualifier("deskOpen2")
	Postazione deskOpen2;
	@Autowired
	@Qualifier("deskOpen3")
	Postazione deskOpen3;
	@Autowired
	@Qualifier("deskOpen4")
	Postazione deskOpen4;
	@Autowired
	@Qualifier("deskOpen5")
	Postazione deskOpen5;

	@Autowired
	@Qualifier("deskRiunioni1")
	Postazione deskRiunioni1;
	@Autowired
	@Qualifier("deskRiunioni2")
	Postazione deskRiunioni2;
	@Autowired
	@Qualifier("deskRiunioni3")
	Postazione deskRiunioni3;
	@Autowired
	@Qualifier("deskRiunioni4")
	Postazione deskRiunioni4;
	
	@Autowired
	@Qualifier("utente1")
	Utente utente1;
	@Autowired
	@Qualifier("utente2")
	Utente utente2;
	@Autowired
	@Qualifier("utente3")
	Utente utente3;
	@Autowired
	@Qualifier("utente4")
	Utente utente4;
	
	@Bean("pren1")
	public Prenotazione pren1() {
		Prenotazione pren = new Prenotazione();
		pren.setUtente(utente1);
		pren.setPostazione(deskOpen1);
		pren.setGiornoPrenotato(LocalDate.of(2022, 8, 22));
		return pren;
	}
	@Bean("pren2")
	public Prenotazione pren2() {
		Prenotazione pren = new Prenotazione();
		pren.setUtente(utente2);
		pren.setPostazione(deskOpen2);
		pren.setGiornoPrenotato(LocalDate.of(2022, 2, 6));
		return pren;
	}
	@Bean("pren3")
	public Prenotazione pren3() {
		Prenotazione pren = new Prenotazione();
		pren.setUtente(utente3);
		pren.setPostazione(deskOpen3);
		pren.setGiornoPrenotato(LocalDate.of(2022, 7, 14));
		return pren;
	}
}
