package com.epicode.gestioneprenotazioni.prenotazioni;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrenotazioneConfig {
	@Bean("pren1")
	public Prenotazione pren1() {
		Prenotazione pren = new Prenotazione();
		pren.setGiornoPrenotato(LocalDate.of(2022, 8, 22));
		return pren;
	}
	@Bean("pren2")
	public Prenotazione pren2() {
		Prenotazione pren = new Prenotazione();
		pren.setGiornoPrenotato(LocalDate.of(2022, 2, 6));
		return pren;
	}
	@Bean("pren3")
	public Prenotazione pren3() {
		Prenotazione pren = new Prenotazione();
		pren.setGiornoPrenotato(LocalDate.of(2022, 7, 14));
		return pren;
	}
}
