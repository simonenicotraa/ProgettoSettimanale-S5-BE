package com.epicode.gestioneprenotazioni.edificio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edifici")
public class EdificioController {
	@Autowired
	private EdificioService edificioService;

	@GetMapping
	public List<Edificio> trovaTutti() {
		return edificioService.trovaTutti();
	}

	@GetMapping("/{id}")
	public Edificio trovaPerId(@PathVariable Integer id) {
		return edificioService.trovaPerId(id);
	}

	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Integer id) {
		edificioService.cancella(id);
		;
	}
	@PostMapping
	public void crea(@RequestBody Edificio edificio) {
		edificioService.crea(edificio);
		;
	}
	@PutMapping
	public void modifica(@RequestBody Edificio edificio) {
		edificioService.modifica(edificio);
	}

}
