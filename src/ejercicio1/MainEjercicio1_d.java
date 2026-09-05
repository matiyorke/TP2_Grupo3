package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
	public static void main(String[] args) {

		Persona p1 = new Persona("20111222", "Juan", "Perez", LocalDate.of(1990, 5, 14),
				"Masculino", "Av. Rivadavia 1234", "1122334455", "juan.perez@mail.com");
		Persona p2 = new Persona("27222333", "Maria", "Gomez", LocalDate.of(1985, 11, 2),
				"Femenino", "San Martin 456", "1133445566", "maria.gomez@mail.com");
		Persona p3 = new Persona("30333444", "Carlos", "Lopez", LocalDate.of(1998, 3, 27),
				"Masculino", "Belgrano 789", "1144556677", "carlos.lopez@mail.com");
		Persona p4 = new Persona("35444555", "Lucia", "Fernandez", LocalDate.of(2000, 8, 9),
				"Femenino", "Mitre 321", "1155667788", "lucia.fernandez@mail.com");
		Persona p5 = new Persona("40555666", "Diego", "Martinez", LocalDate.of(1979, 12, 19),
				"Masculino", "Sarmiento 654", "1166778899", "diego.martinez@mail.com");

		HashSet<Persona> setPersonas = new HashSet<Persona>();
		setPersonas.add(p1);
		setPersonas.add(p2);
		setPersonas.add(p3);
		setPersonas.add(p4);
		setPersonas.add(p5);

		Iterator<Persona> it = setPersonas.iterator();
		while (it.hasNext()) {
			Persona p = it.next();
			System.out.println(p);
		}

	}
}
