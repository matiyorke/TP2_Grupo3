package Ejercicio2;

public class EdificioDeOficinas extends Edificio {

	private int numeroOficinas;
	
	public EdificioDeOficinas() {
		
	}
	
	public EdificioDeOficinas(double superficie, String nombre) {
		super(superficie, nombre);
		// numeroOficinas queda sin cargar; se completa despues con setNumeroOficinas()
	}

	public EdificioDeOficinas(int numeroOficinas) {
		super();
		this.numeroOficinas = numeroOficinas;
		// superficie y nombre quedan sin cargar; se completan despues con setSuperficie()/setNombre()
	}

	public EdificioDeOficinas(double superficie, String nombre, int numeroOficinas) {
		super(superficie, nombre);
		this.numeroOficinas = numeroOficinas;
	}

	@Override
	public double getSuperficieEdificio() {
		return this.superficie;
	}

	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

}