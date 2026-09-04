package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {
	public static void main(String[] args) {

        TreeSet<Empleado> listaempleado = new TreeSet<Empleado>();

        Empleado e1 = new Empleado("40123456","Juan", "Perez",LocalDate.of(2000, 5, 15), "M","Av. Siempre Viva 123","1123456789","juan@gmail.com", "Programador");

        Empleado e2 = new Empleado("41234567","Maria","Gomez",LocalDate.of(1999, 8, 22),"F","Calle Rivadavia 456","1134567890","maria@gmail.com","Analista");

        Empleado e3 = new Empleado("42345678","Carlos","Lopez",LocalDate.of(2001, 3, 10),"M","Calle Belgrano 789","1145678901","carlos@gmail.com","Desarrollador");

        Empleado e4 = new Empleado("43456789","Sofia","Martinez",LocalDate.of(2002, 11, 5),"F","Calle Mitre 321","1156789012","sofia@gmail.com","Tester");

        Empleado e5 = new Empleado("44567890","Lucas","Fernandez",LocalDate.of(1998, 7, 30),"M","Calle Sarmiento 654","1167890123","lucas@gmail.com","Administrador");
            listaempleado.add(e1);
            listaempleado.add(e2);
            listaempleado.add(e3);
            listaempleado.add(e4);
            listaempleado.add(e5);

            Iterator<Empleado> it1 =listaempleado.iterator();
            while(it1.hasNext())
            {

                Empleado e = it1.next();
                System.out.println(e.toString());


            }

	}
	}
	
