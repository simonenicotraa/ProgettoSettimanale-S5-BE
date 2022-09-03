package com.epicode.gestioneprenotazioni.prenotazioni;

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

import com.epicode.gestioneprenotazioni.postazioni.TipoPostazione;


@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {
	@Autowired
	private PrenotazioneService prenService;
	
	@GetMapping
	public List<Prenotazione> trovaTutti() {
		return prenService.trovaTutti();
	}

	@GetMapping("/{id}")
	public Prenotazione trovaPerId(@PathVariable Long id) {
		return prenService.trovaPerId(id);
	}

	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		prenService.cancella(id);
		;
	}

	@PostMapping
	public void crea(@RequestBody Prenotazione prenotazione) {
		prenService.crea(prenotazione);

	}

	@PutMapping
	public void modifica(@RequestBody Prenotazione prenotazione) {
		prenService.modifica(prenotazione);
	}

	
}
