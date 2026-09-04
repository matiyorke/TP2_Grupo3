package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.time.LocalDate;


public class MainEjercicio1_b {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("40123456", "Juan", "Pérez", LocalDate.of(1995, 3, 15), "Masculino", "Av. Belgrano 1250", "1123456789", "juan.perez@email.com", "Desarrollador Backend");
		Empleado emp2 = new Empleado("42345678", "María", "Gómez", LocalDate.of(1998, 7, 22), "Femenino", "Calle San Martín 845", "1134567890", "maria.gomez@email.com", "Analista de Sistemas");
		Empleado emp3 = new Empleado("38765432", "Lucas", "Fernández", LocalDate.of(1992, 11, 8), "Masculino", "Av. Rivadavia 2345", "1145678901", "lucas.fernandez@email.com", "Desarrollador Frontend");
		Empleado emp4 = new Empleado("41567890", "Sofía", "Rodríguez", LocalDate.of(1997, 1, 30), "Femenino", "Calle Mitre 567", "1156789012", "sofia.rodriguez@email.com", "Diseñadora UX/UI");
		Empleado emp5 = new Empleado("36901234", "Carlos", "Martínez", LocalDate.of(1989, 9, 12), "Masculino", "Av. Corrientes 1890", "1167890123", "carlos.martinez@email.com", "Gerente de Proyecto");
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(emp1);
		listaEmpleados.add(emp2);
		listaEmpleados.add(emp3);
		listaEmpleados.add(emp4);
		listaEmpleados.add(emp5);
		
		ListIterator<Empleado> it = listaEmpleados.listIterator();
		while(it.hasNext()) {
			Empleado empleado = it.next();
			System.out.println(empleado.toString());
		}

	}

}
