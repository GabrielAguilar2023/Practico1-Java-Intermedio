package inscripcion.clases;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<Materia> materiasAprobadas= new ArrayList<>();
	
//************ Constructor **************
	
	public Alumno(String nombreIngresado) {
		this.nombre = nombreIngresado;
	}
	
//********** Getter and Setter ************
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

//************Otros Metodos ***************
	
	public void setMateriasAprobadas(Materia materiasAprobada) {	
		this.materiasAprobadas.add(materiasAprobada);
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean materiaPedida(String materiaAProbar) {
		return this.materiasAprobadas.contains(materiaAProbar);
	}
	

}
