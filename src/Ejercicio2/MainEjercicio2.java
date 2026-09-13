package Ejercicio2;

import java.util.ArrayList;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		PoliDeportivo poli1 = new PoliDeportivo(5000, "Polideportivo Municipal");

		PoliDeportivo poli2 = new PoliDeportivo(3500, "Polideportivo Benavidez");

		PoliDeportivo poli3 = new PoliDeportivo(4200, "Polideportivo Pacheco");
		
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>();
        
		listaEdificios.add(poli1);

		listaEdificios.add(poli2);

		listaEdificios.add(poli3);
		
	}

}
