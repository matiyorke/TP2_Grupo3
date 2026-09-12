package Ejercicio2;

public class EdificioDeOficinas extends Edificio {

	private int numeroOficinas;
	
	public EdificioDeOficinas() {
		
	}
	
	public EdificioDeOficinas(double superficie, String nombre) {
		super(superficie, nombre);
	}
	
	public EdificioDeOficinas(int numeroOficinas) {
		super();
		this.numeroOficinas = numeroOficinas;
	}

	@Override
	public double getSuperficieEdificio() {
		return this.superficie;
	}

}