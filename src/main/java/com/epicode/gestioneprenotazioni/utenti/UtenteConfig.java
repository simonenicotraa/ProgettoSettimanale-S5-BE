package com.epicode.gestioneprenotazioni.utenti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazione;


@Configuration
public class UtenteConfig {


	@Bean("utente1")
	public Utente utente1() {
		Utente utente = new Utente();
		utente.setUsername("GinoStruzzo");
		utente.setNomeCompleto("Gioacchino Struzzo");
		utente.setEmail("gino.struzzo@gmail.com");
		
		return utente;
	}

	@Bean("utente2")
	public Utente utente2() {
		Utente utente = new Utente();
		utente.setUsername("SalvoMuratore");
		utente.setNomeCompleto("Salvatore Muratore");
		utente.setEmail("salvoMuratore@gmail.com");
		return utente;

	}

	@Bean("utente3")
	public Utente utente3() {
		Utente utente = new Utente();
		utente.setUsername("CleoSanta");
		utente.setNomeCompleto("Cleopatra Santa");
		utente.setEmail("CleoSanta@gmail.com");
		return utente;

	}

	@Bean("utente4")
	public Utente utente4() {
		Utente utente = new Utente();
		utente.setUsername("PippoTopo");
		utente.setNomeCompleto("Giuseppe Topone");
		utente.setEmail("PippoTopo@gmail.com");
		return utente;
	}

}
