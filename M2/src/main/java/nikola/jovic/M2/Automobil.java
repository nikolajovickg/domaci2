package nikola.jovic.M2;

import nikola.jovic.M3.TipVozila;

public class Automobil implements Vozilo {
	private TipVozila tipVozila;
	public Automobil() {
		setVozilo(TipVozila.KOPNENI);
	}

	@Override
	public TipVozila getVozilo() {
		return this.tipVozila;
	}
	private void setVozilo(TipVozila tipVozila) {
		this.tipVozila = tipVozila;
	}
}
