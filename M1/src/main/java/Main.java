import java.util.*;
import nikola.jovic.M2.*;
import nikola.jovic.M3.*;
public class Main {

	public static void main(String args[]) {
		HashMap<Integer, Vozilo> mapa = new HashMap<Integer, Vozilo>();
		mapa.put(1, new Automobil());
		mapa.put(2, new Automobil());
		System.out.println("Vozila u mapi su:");
		for (int kljuc: mapa.keySet()) {
			System.out.println(mapa.get(kljuc).getVozilo());
		}
		System.out.println("Tipovi vozila su:");
		for (TipVozila tip: TipVozila.values()) {
			System.out.println(tip);
		};
		
		
	}

}
