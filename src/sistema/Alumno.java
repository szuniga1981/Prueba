package sistema;

public class Alumno {

	/**
	 * Default constructor
	 */
	public Alumno() {
	}

	



	

	public Alumno(String RUT, String nombre, String apellido, String direccion) {
		super();
		this.RUT = RUT;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
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
