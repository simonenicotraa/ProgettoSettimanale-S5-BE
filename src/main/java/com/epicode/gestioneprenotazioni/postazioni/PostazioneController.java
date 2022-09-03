package com.epicode.gestioneprenotazioni.postazioni;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazione;


@RestController
@RequestMapping("/postazioni")
public class PostazioneController {

	@Autowired
	private PostazioneService postazioneService;

	@GetMapping("/trovaPostazioniPercittaeTipo")
	public List<Postazione>trovaPostazioniPercittaeTipo(@RequestParam String citta, @RequestParam TipoPostazione tipo){
		return postazioneService.trovaPostazioniPercittaeTipo(citta, tipo);
	}
	@GetMapping
	public List<Postazione> trovaTutti() {
		return postazioneService.trovaTutti();
	}

	@GetMapping("/{id}")
	public Postazione trovaPerId(@PathVariable Integer id) {
		return postazioneService.trovaPerId(id);
	}

	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Integer id) {
		postazioneService.cancella(id);
		;
	}

	@PostMapping
	public void crea(@RequestBody Postazione postazione) {
		postazioneService.crea(postazione);
	}

	@PutMapping
	public void modifica(@RequestBody Postazione postazione) {
		postazioneService.modifica(postazione);
	}

}
