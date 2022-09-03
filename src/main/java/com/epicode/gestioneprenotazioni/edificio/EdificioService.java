package com.epicode.gestioneprenotazioni.edificio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
	@Autowired
	EdificioRepository repo;

	public List<Edificio> trovaTutti() {
		return (List<Edificio>) repo.findAll();
	}

	public Edificio trovaPerId(Integer id) {
		return repo.findById(id).get();
	}

	public void cancella(Integer id) {
		repo.deleteById(id);
	}

	public void crea(Edificio edificio) {
		repo.save(edificio); // save funziona come persist e il merge
	}

	public void modifica(Edificio edificio) {
		repo.save(edificio);
	}
}
