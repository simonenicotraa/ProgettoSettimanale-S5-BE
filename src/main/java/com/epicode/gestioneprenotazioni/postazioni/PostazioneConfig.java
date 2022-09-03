package com.epicode.gestioneprenotazioni.postazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.epicode.gestioneprenotazioni.prenotazioni.Prenotazione;

@Configuration
public class PostazioneConfig {
	@Autowired @Qualifier ("pren1") Prenotazione pren1;
	@Autowired @Qualifier ("pren2") Prenotazione pren2;
	@Autowired @Qualifier ("pren3") Prenotazione pren3;
	// ================================ POSTAZIONI PRIVATE
	// ================================
//	@Autowired
//	ObjectProvider<Postazione> postProvider;

	@Bean("deskPriv1")
	public Postazione deskPriv1() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(1);
		postazione.setDescrizione("Scrivania attrezzata, chiusa da pannelli, per lavori in solitaria");
		postazione.setTipo(TipoPostazione.PRIVATO);
		postazione.setNumOccupanti(1);
		postazione.aggiungiPrenotazione(pren1);
		postazione.aggiungiPrenotazione(pren2);
		postazione.aggiungiPrenotazione(pren3);
		return postazione;
	}

	@Bean("deskPriv2")
	public Postazione deskPriv2() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(2);
		postazione.setDescrizione("Scrivania attrezzata, chiusa da pannelli, per lavori in solitaria");
		postazione.setTipo(TipoPostazione.PRIVATO);
		postazione.setNumOccupanti(1);
		return postazione;

	}

	@Bean("deskPriv3")
	public Postazione deskPriv3() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(3);
		postazione.setDescrizione("Scrivania attrezzata, chiusa da pannelli, per lavori in solitaria");
		postazione.setTipo(TipoPostazione.PRIVATO);
		postazione.setNumOccupanti(1);
		return postazione;
	}

	@Bean("deskPriv4")
	public Postazione deskPriv4() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(4);
		postazione.setDescrizione("Scrivania attrezzata, chiusa da pannelli, per lavori in solitaria");
		postazione.setTipo(TipoPostazione.PRIVATO);
		postazione.setNumOccupanti(1);
		return postazione;
	}

	@Bean("deskPriv5")
	public Postazione deskPriv5() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(5);
		postazione.setDescrizione("Scrivania attrezzata, chiusa da pannelli, per lavori in solitaria");
		postazione.setTipo(TipoPostazione.PRIVATO);
		postazione.setNumOccupanti(1);
		return postazione;
	}

	@Bean("deskPriv6")
	public Postazione deskPriv6() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(6);
		postazione.setDescrizione("Scrivania attrezzata, chiusa da pannelli, per lavori in solitaria");
		postazione.setTipo(TipoPostazione.PRIVATO);
		postazione.setNumOccupanti(1);
		return postazione;
	}

	// ================================ POSTAZIONI OPENSPACE
	// ================================
	@Bean("deskOpen1")
	public Postazione deskOpen1() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(7);
		postazione.setDescrizione("Scrivania con solo attacco corrente elettrica, ideale per lavori di gruppo");
		postazione.setTipo(TipoPostazione.OPENSPACE);
		postazione.setNumOccupanti(5);
		return postazione;

	}

	@Bean("deskOpen2")
	public Postazione deskOpen2() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(8);
		postazione.setDescrizione("Scrivania con solo attacco corrente elettrica, ideale per lavori di gruppo");
		postazione.setTipo(TipoPostazione.OPENSPACE);
		postazione.setNumOccupanti(4);
		return postazione;
	}

	@Bean("deskOpen3")
	public Postazione deskOpen3() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(9);
		postazione.setDescrizione("Scrivania con solo attacco corrente elettrica, ideale per lavori di gruppo");
		postazione.setTipo(TipoPostazione.OPENSPACE);
		postazione.setNumOccupanti(5);
		return postazione;
	}

	@Bean("deskOpen4")
	public Postazione deskOpen4() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(10);
		postazione.setDescrizione("Scrivania con solo attacco corrente elettrica, ideale per lavori di gruppo");
		postazione.setTipo(TipoPostazione.OPENSPACE);
		postazione.setNumOccupanti(5);
		return postazione;
	}

	@Bean("deskOpen5")
	public Postazione deskOpen5() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(11);
		postazione.setDescrizione("Scrivania con solo attacco corrente elettrica, ideale per lavori di gruppo");
		postazione.setTipo(TipoPostazione.OPENSPACE);
		postazione.setNumOccupanti(5);
		return postazione;
	}

	// ================================ POSTAZIONI RIUNIONI
	// ================================
	@Bean("deskRiunioni1")
	public Postazione deskRiunioni1() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(12);
		postazione.setDescrizione("Sala Riunioni ");
		postazione.setTipo(TipoPostazione.SALA_RIUNIONI);
		postazione.setNumOccupanti(25);
		return postazione;

	}

	@Bean("deskRiunioni2")
	public Postazione deskRiunioni2() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(13);
		postazione.setDescrizione("Sala Riunioni ");
		postazione.setTipo(TipoPostazione.SALA_RIUNIONI);
		postazione.setNumOccupanti(25);
		return postazione;
	}

	@Bean("deskRiunioni3")
	public Postazione deskRiunioni3() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(14);
		postazione.setDescrizione("Sala Riunioni ");
		postazione.setTipo(TipoPostazione.SALA_RIUNIONI);
		postazione.setNumOccupanti(25);
		return postazione;
	}

	@Bean("deskRiunioni4")
	public Postazione deskRiunioni4() {
		Postazione postazione = new Postazione();
		postazione.setCodUnivoco(15);
		postazione.setDescrizione("Sala Riunioni ");
		postazione.setTipo(TipoPostazione.SALA_RIUNIONI);
		postazione.setNumOccupanti(25);
		return postazione;
	}
}
