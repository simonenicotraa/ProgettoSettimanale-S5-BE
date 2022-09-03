package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {

	@Query("SELECT ele FROM Prenotazione ele WHERE ele.postazione.codUnivoco =:codUnivoco AND ele.giornoPrenotato =:giornoPrenotato")
	public List<Prenotazione> findByVerificaSeTavoloOccupato(Integer codUnivoco, LocalDate giornoPrenotato);
	
	@Query("SELECT ele FROM Prenotazione ele WHERE ele.utente.id =:id AND ele.giornoPrenotato =:giornoPrenotato")
	public List<Prenotazione> findByPrenotazioniUtente(Integer id, LocalDate giornoPrenotato);
}
