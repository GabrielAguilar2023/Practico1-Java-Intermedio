package inscripcion;

import inscripcion.clases.*;

public class Main {

	public static void main(String[] args) {
		// Materias del primer cuatrimestre (¡Ponele!)
		
		Materia materia1_1 = new Materia("Algoritmos");
		Materia materia1_2 = new Materia("Estructuras de Datos");
		
//Materias del segundo cuatrimestre que tiene como correlativas las anteriores
		
		Materia materia2_1 = new Materia("Paradigmas de Programacion");
	
//Materias del tercer cuatrimestre
		
		Materia materia3_1 = new Materia("Diseño de Sistemas");
									
//Regimen de correlativas:(Se agragan a la lista de correlativas de cada materia)
		
		materia2_1.setMateriasCorrelativas(materia1_1);
		materia2_1.setMateriasCorrelativas(materia1_2);
		
		materia3_1.setMateriasCorrelativas(materia2_1);

//Definicion de  un Alumno
		
		Alumno alumno1 = new Alumno("Bizarrap"); 
		
//Grande BZRP!!!! primer cuatrimestre aprobado
		
		alumno1.setMateriasAprobadas(materia1_1);
		alumno1.setMateriasAprobadas(materia1_2);	
			
//BZRP trata de inscribirse al segundo cuatri
		
		Inscripcion inscripcion = new Inscripcion (alumno1,materia2_1);
		System.out.println("El resultado de la inscripcion es " + inscripcion.aprobada());
	}
}
