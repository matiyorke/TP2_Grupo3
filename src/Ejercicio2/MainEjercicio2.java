package Ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		PoliDeportivo poli1 = new PoliDeportivo(5000, "Polideportivo Municipal");

		PoliDeportivo poli2 = new PoliDeportivo(3500, "Polideportivo Benavidez");

		PoliDeportivo poli3 = new PoliDeportivo(4200, "Polideportivo Pacheco");
		
		EdificioDeOficinas edificio1 = new EdificioDeOficinas(2000, "Edificio Centro", 15);

		EdificioDeOficinas edificio2 = new EdificioDeOficinas(3500, "Edificio Norte", 25);
		
		ArrayList<Edificio> listaEdificios = new ArrayList<Edificio>();
        
		listaEdificios.add(poli1);

		listaEdificios.add(poli2);

		listaEdificios.add(poli3);
		
		listaEdificios.add(edificio1);

		listaEdificios.add(edificio2);
		
		ListIterator<Edificio> iterator = listaEdificios.listIterator();

		while (iterator.hasNext()) {

		    Edificio edificio = iterator.next();

		    System.out.println(edificio.getNombre());
		    System.out.println("Superficie: " + edificio.getSuperficieEdificio() + "m²\n");

		}
		
	}

}
