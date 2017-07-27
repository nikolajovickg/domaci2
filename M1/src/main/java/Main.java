import java.util.*;
import java.util.Map.Entry;

import nikola.jovic.M2.*;
import nikola.jovic.M3.*;
public class Main {
	public static void main(String args[]) {
		HashMap<Integer, Vozilo> mapa = new HashMap<Integer, Vozilo>();
		mapa.put(1, VoziloFactory.vozilo(TipVozila.VAZDUSNI));
		mapa.put(2, VoziloFactory.vozilo(TipVozila.KOPNENI));
		mapa.put(3, VoziloFactory.vozilo(TipVozila.VAZDUSNI));
		mapa.put(4, VoziloFactory.vozilo(TipVozila.KOPNENI));
		mapa.put(5, VoziloFactory.vozilo(TipVozila.KOPNENI));
		
		System.out.println("Tipovi vozila su:");
		for (TipVozila tip: TipVozila.values()) {
			System.out.println(tip);
		};
		
		System.out.println("Vozila u mapi su:");
		for (int kljuc: mapa.keySet()) {
			System.out.println("Kljuc: " + kljuc + ", " + mapa.get(kljuc).toString());
		}
		
		mapa.remove(3);
		
		System.out.println("Posle brisanja, vozila u mapi su:");
		for (Entry<Integer, Vozilo> vozilo: mapa.entrySet()) {
			System.out.println("Kljuc: " + vozilo.getKey() + ", " + vozilo.getValue().toString());
		}
		
	}

}
