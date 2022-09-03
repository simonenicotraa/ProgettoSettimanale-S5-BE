package com.epicode.gestioneprenotazioni.edificio;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.postazioni.Postazione;

@Configuration
public class EdificioConfig {

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

//	@Autowired
//	ObjectProvider<Edificio> edificioProvider;

	@Bean("edificio1")
	public Edificio edificio1() {
		Edificio edificio = new Edificio();
		edificio.setNome("Palazzo Matrix");
		edificio.setIndirizzo("via del flex 22");
		edificio.setCitta("Torino");

		edificio.aggiungiPostazione(deskPriv1);
		edificio.aggiungiPostazione(deskPriv2);
		edificio.aggiungiPostazione(deskOpen1);
		edificio.aggiungiPostazione(deskRiunioni1);
		return edificio;
	}

	@Bean("edificio2")
	public Edificio edificio2() {
		Edificio edificio = new Edificio();
		edificio.setNome("Palazzo Crisantemo");
		edificio.setIndirizzo("via dei container 299");
		edificio.setCitta("Milano");

		edificio.aggiungiPostazione(deskPriv3);
		edificio.aggiungiPostazione(deskPriv4);
		edificio.aggiungiPostazione(deskOpen2);
		edificio.aggiungiPostazione(deskRiunioni2);
		return edificio;
	}

	@Bean("edificio3")
	public Edificio edificio3() {
		Edificio edificio = new Edificio();
		edificio.setNome("Palazzo Filomeno");
		edificio.setIndirizzo("via del giochino 42");
		edificio.setCitta("Campobasso");

		edificio.aggiungiPostazione(deskPriv5);
		edificio.aggiungiPostazione(deskPriv6);
		edificio.aggiungiPostazione(deskOpen3);
		edificio.aggiungiPostazione(deskRiunioni3);
		return edificio;
	}

	@Bean("edificio4")
	public Edificio edificio4() {
		Edificio edificio = new Edificio();
		edificio.setNome("Palazzo Sereno");
		edificio.setIndirizzo("via della calma 2");
		edificio.setCitta("Grosseto");

		edificio.aggiungiPostazione(deskOpen4);
		edificio.aggiungiPostazione(deskOpen5);
		edificio.aggiungiPostazione(deskRiunioni4);
		return edificio;
	}

}
