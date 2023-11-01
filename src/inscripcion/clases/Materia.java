package inscripcion.clases;

import java.util.ArrayList;

public class Materia {
	//***** PROPIEDADES *******
	
		private String nombre;
		private ArrayList <Materia> materiasCorrelativas = new ArrayList<>();
		
		
	//**** METODOS ******
		
		//********* Constructor **********
		
		public Materia(String nombreRecibido) {
			this.nombre = nombreRecibido;
		}

		//****** Getter and Setter ******

		public ArrayList<Materia> getMateriasCorrelativas() {
			
			return materiasCorrelativas;
		}

		public void setMateriasCorrelativas(Materia materiasCorrelativas) {
			
			this.materiasCorrelativas.add(materiasCorrelativas);
		}
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		


}
