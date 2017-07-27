package nikola.jovic.M2;

import nikola.jovic.M3.TipVozila;

public class Automobil implements Vozilo {
	private TipVozila tipVozila;
	private static int brojac = 0;
	private int id = 0;
	public Automobil() {
		setVozilo(TipVozila.KOPNENI);
		this.id = brojac++;
	}

	@Override
	public TipVozila getVozilo() {
		return this.tipVozila;
	}
	private void setVozilo(TipVozila tipVozila) {
		this.tipVozila = tipVozila;
	}
	public int getId() {
		return this.id;
	}
	public String toString() {
		return ("Vozilo je Automobil, serijski broj:" + getId());
	}
}
