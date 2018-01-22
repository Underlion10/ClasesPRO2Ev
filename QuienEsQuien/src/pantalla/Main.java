package pantalla;

import Personaje.CreacionPersonajes;

public class Main {
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		CreacionPersonajes creacion = new CreacionPersonajes();
		System.out.println(creacion.personajeDef().getNombre());
		ventana.setVisible(true);
		System.out.println("fn");
	}

}
