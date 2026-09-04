package ejercicio1;
import java.time.LocalDate;
import java.util.Comparator;

public class Empleado extends Persona implements Comparable<Empleado>{
	
	private final int legajo; 
	private String puesto;
	static int legajocont=1000;
	
	//Constructores	
	public Empleado() {
		super();
		this.legajo=legajocont++;
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		
		this.legajo=legajocont++;
		this.puesto = puesto;
	}

	//Getters y Setters
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public static int getLegajocont() {
		return legajocont;
	}

	public int getLegajo() {
		return legajo;
	}
	
	//ToString
	@Override
	public String toString() {
		return "| LEGAJO: " + legajo + " - Puesto: " + puesto + "\n  " + super.toString() + "\n";
	}	
	
	public static int devuelveProximoLegajo(){		
		return legajocont; 
	}

	
		
	 
		@Override
		public int compareTo(Empleado o) {
			
			 if (this.getDni().compareTo(o.getDni()) < 0) {
		            return -1;
		        } else if (this.getDni().compareTo(o.getDni()) > 0) {
		            return 1;
		        } else {
		            return 0;
		        }
		}
		
	
}
