package nikola.jovic.M2;

import nikola.jovic.M3.TipVozila;

public class VoziloFactory {

	private VoziloFactory() {
	}

	public static Vozilo getVozilo(TipVozila tip) {
		switch (tip) {
		case VAZDUSNI:
			return new Avion();
		case KOPNENI:
		default:
			return new Automobil();
		}		
	}
}
