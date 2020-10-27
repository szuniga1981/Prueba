package sistema;

public class Materia extends Alumno {
	
		
	
	protected String Matematicas;
	protected String Lenguaje;
	protected String Ciencia;
    protected String Historia;
    
	@Override
	public String toString() {
		return "Materia [Matematicas=" + Matematicas + ", Lenguaje=" + Lenguaje + ", Ciencia=" + Ciencia + ", Historia="
				+ Historia + "]";
	}

	public Materia(String pMatematicas, String pLenguaje, String pCiencias, String pHistoria) {
		super();
		Matematicas = pMatematicas;
		Lenguaje = pLenguaje;
		Ciencia = pCiencias;
		Historia = pHistoria;
	}

	public String getMatematicas() {
		return Matematicas;
	}

	public void setMatematicas(String matematicas) {
		Matematicas = matematicas;
	}

	public String getLenguaje() {
		return Lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		Lenguaje = lenguaje;
	}

	public String getCiencia() {
		return Ciencia;
	}

	public void setCiencia(String ciencia) {
		Ciencia = ciencia;
	}

	public String getHistoria() {
		return Historia;
	}

	public void setHistoria(String historia) {
		Historia = historia;
	}
    
    
	
}	
