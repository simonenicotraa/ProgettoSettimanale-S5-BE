package com.epicode.gestioneprenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestioneprenotazioni.edificio.EdificioConfig;
import com.epicode.gestioneprenotazioni.edificio.EdificioService;
import com.epicode.gestioneprenotazioni.postazioni.PostazioneConfig;
import com.epicode.gestioneprenotazioni.postazioni.PostazioneService;
import com.epicode.gestioneprenotazioni.prenotazioni.PrenotazioneConfig;
import com.epicode.gestioneprenotazioni.prenotazioni.PrenotazioneService;
import com.epicode.gestioneprenotazioni.utenti.UtenteConfig;
import com.epicode.gestioneprenotazioni.utenti.UtenteController;
import com.epicode.gestioneprenotazioni.utenti.UtenteService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppRunner implements ApplicationRunner {

	@Autowired
	EdificioService edificioService;
	@Autowired
	PostazioneService postazioneService;
	@Autowired
	PrenotazioneService prenotazioneService;
	@Autowired
	UtenteService utenteService;
	//Author SimoneNicotra
	@Autowired
	EdificioConfig edificioConfig;
	@Autowired
	PostazioneConfig postazioneConfig;
	@Autowired
	PrenotazioneConfig prenotazioneConfig;
	@Autowired
	UtenteConfig utenteConfig;
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Applicazione Iniziata");

		
		edificioService.crea(edificioConfig.edificio1());
		edificioService.crea(edificioConfig.edificio2());
		edificioService.crea(edificioConfig.edificio3());
		edificioService.crea(edificioConfig.edificio4());
		
		utenteService.crea(utenteConfig.utente1());
		utenteService.crea(utenteConfig.utente2());
		utenteService.crea(utenteConfig.utente3());
		utenteService.crea(utenteConfig.utente4());
		
		prenotazioneService.crea(prenotazioneConfig.pren1());
		prenotazioneService.crea(prenotazioneConfig.pren2());
		prenotazioneService.crea(prenotazioneConfig.pren3());
	}
}
