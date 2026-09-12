package Ejercicio2;

public class PoliDeportivo extends Edificio implements InstalacionDeportiva{
	
	public PoliDeportivo() {
		
	}
	
	public PoliDeportivo(double superficie, String nombre) {
		
		super(superficie, nombre);
		
	}

	@Override
	public double getSuperficieEdificio() {	
		return this.superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}


}