package com.epicode.gestioneprenotazioni.utenti;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
	@Autowired
	UtenteRepository repo;

	public List<Utente> trovaTutti() {
		return (List<Utente>) repo.findAll();
	}

	public Utente trovaPerId(Integer id) {
		return repo.findById(id).get();
	}

	public void cancella(Integer id) {
		repo.deleteById(id);
	}

	public void crea(Utente utente) {
		repo.save(utente);
	}

	public void modifica(Utente utente) {
		repo.save(utente);
	}
}
