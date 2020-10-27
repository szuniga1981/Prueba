package sistema;

public class Alumno {

	/**
	 * Default constructor
	 */
	public Alumno() {
	}

	

	@Override
	public String toString() {
		return "Alumno [RUT=" + RUT + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ "]";
	}



	public Alumno(String pRUT, String pNombre, String pApellido, String pDireccion) {
		super();
		this.RUT=pRUT;
		this.nombre = pNombre;
		this.apellido = pApellido;
		this.direccion = pDireccion;

	}

	protected String RUT;
	protected String nombre;
	protected String apellido;
	protected String direccion;

	public String getRUT() {
		return RUT;
	}

	public void setRUT(String rUT) {
		RUT = rUT;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
