package Ejercicio2;

public class EdificioDeOficinas implements Edificio {

	private int numeroOficinas;
	
	public EdificioDeOficinas() {
		
	}
	
	public EdificioDeOficinas(int numeroOficinas) {
		super();
		this.numeroOficinas = numeroOficinas;
	}

	@Override
	public double getSuperficieEdificio() {
		return 0;
	}

}