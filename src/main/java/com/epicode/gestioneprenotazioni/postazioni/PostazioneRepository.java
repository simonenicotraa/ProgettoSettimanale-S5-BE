package com.epicode.gestioneprenotazioni.postazioni;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Integer> {
	
	@Query("SELECT p FROM Postazione p WHERE p.edificio.citta =:citta AND p.tipo =:tipo")
	public List<Postazione> findByCittaAndTipo(String citta, TipoPostazione tipo);

}
