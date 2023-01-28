package Colecciones;

public class Restaurant {
	
	protected String nombre;
	protected int puntuacion;
	
	public Restaurant(String nombre, int puntuacion) {
		this.nombre=nombre;
		this.puntuacion=puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	@Override
	public boolean equals(Object otroRest) {
		if (otroRest instanceof Restaurant) {
			Restaurant otro = (Restaurant) otroRest;
			if (this.nombre.equals(otro.nombre) && this.puntuacion == otro.puntuacion) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
        
    }


	@Override
	public int hashCode() {
	    int result = nombre != null ? nombre.hashCode() : 0;
	    result = (31 * result) + puntuacion;
	    return result;
	}
}
