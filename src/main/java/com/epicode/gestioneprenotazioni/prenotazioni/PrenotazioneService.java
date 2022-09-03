package com.epicode.gestioneprenotazioni.prenotazioni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {
	@Autowired
	PrenotazioneRepository repo;

	public List<Prenotazione> trovaTutti() {
		return (List<Prenotazione>) repo.findAll();
	}

	public Prenotazione trovaPerId(Long id) {
		return repo.findById(id).get();
	}

	public void cancella(Long id) {
		repo.deleteById(id);
	}

	public void crea(Prenotazione pren) {
		//verifico 
		//1 se l'utente ha effettuato una prenotazione nella data di prenotazione 
		//2 verifico la grandezza della lista di prenotazioni del tavolo e confronto se è minore del numero massimo di partecipanti ad un tavolo
		if(repo.findByPrenotazioniUtente(pren.getUtente().getId(), pren.getGiornoPrenotato()).size() == 0
				|| 
			repo.findByVerificaSeTavoloOccupato(pren.getPostazione().getCodUnivoco(), pren.getGiornoPrenotato()).size() < pren.getPostazione().getNumOccupanti()) {
		repo.save(pren);
		}
	}

	public void modifica(Prenotazione pren) {
		repo.save(pren);
	}
}
