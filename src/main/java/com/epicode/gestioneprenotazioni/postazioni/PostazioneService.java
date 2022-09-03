package com.epicode.gestioneprenotazioni.postazioni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {
	@Autowired
	PostazioneRepository repo;

	public List<Postazione> trovaPostazioniPercittaeTipo(String citta, TipoPostazione tipo) {
		return repo.findByCittaAndTipo(citta, tipo);
	}

	public List<Postazione> trovaTutti(){
		return (List<Postazione>) repo.findAll();
	}
	public Postazione trovaPerId(Integer id) {
		return repo.findById(id).get();
	}

	public void cancella(Integer id) {
		repo.deleteById(id);
	}

	public void crea(Postazione postazione) {
		repo.save(postazione); // save funziona come persist e il merge
	}

	public void modifica(Postazione postazione) {
		repo.save(postazione);
	}
}
