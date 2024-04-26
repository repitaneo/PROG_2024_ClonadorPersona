package utilidades;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import persona.Persona;

public class ClonadorPersonas {

	
	private String nombre;

	
	/**
	 * 
	 * @param nombre
	 */
	public ClonadorPersonas(String nombre) {
		
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Persona> generarClones() {
		
		List<Persona> personas = new LinkedList<Persona>();
		for(int i=0;i<10;i++) {

			// creo una persona
			Persona p = FactoryPersona.getPersona(nombre);
			
			// compruebo la persona
			boolean personaValida = ValidadorPersona.isValid(p);
			
			if(personaValida) {
				personas.add(0, p);
			}
		}
		return personas;
	}
	
}
