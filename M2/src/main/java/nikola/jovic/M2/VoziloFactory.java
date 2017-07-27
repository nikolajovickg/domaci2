package nikola.jovic.M2;

import nikola.jovic.M3.TipVozila;

public class VoziloFactory {

	private VoziloFactory() {
	}

	public static Vozilo vozilo(TipVozila tip) {
		switch (tip) {
		case VAZDUSNI:
			return new Avion();
		case KOPNENI:
			return new Automobil();
		default:
			return null;
		}		
	}
}
