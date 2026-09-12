package Ejercicio2;

public abstract class Edificio {
	
	protected double superficie;
    protected String nombre;
    
    public Edificio() {}
    
    Edificio(double superficie , String nombre)
    {
    	this.superficie = superficie;
    	this.nombre = nombre;
    }
    
		
    public double getSuperficieEdificio() {
    	return superficie;
    }

    public void setSuperficie(double superficie) {
    	this.superficie = superficie;
    }

    public String getNombre() {
    	return nombre;
    }

    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
}
