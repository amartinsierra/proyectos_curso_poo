package principal;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private String pais;
	public Ciudad(String nombre, int poblacion, String pais) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
