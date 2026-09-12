package Ejercicio2;

public class PoliDeportivo implements InstalacionDeportiva, Edificio {

	private double superficie;
	private String nombre;
	
	public PoliDeportivo() {
		
	}
	
	public PoliDeportivo(double superficie, String nombre) {
		super();
		this.superficie = superficie;
		this.nombre = nombre;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}


}