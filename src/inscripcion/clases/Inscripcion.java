package inscripcion.clases;

public class Inscripcion {
	private Alumno alumno;
	private Materia materia;
	
	public Inscripcion(Alumno alumnoIngresado, Materia materiaIngresada) {
		super();
		this.alumno = alumnoIngresado;
		this.materia = materiaIngresada;
	}
	
	public boolean aprobada() {
		for (Materia cadaMateria : this.materia.getMateriasCorrelativas())			// Por cada materia correlativa de la materia a inscribir
			if (!(this.alumno.getMateriasAprobadas().contains(cadaMateria))) {		// recorre todas las materias aprobadas del alumno en cuestion.
				return false;														// Si encuentra alguna correlativa que no esté como materia aprobada
			}																		// retornará false.
		return true;		
	}

}
