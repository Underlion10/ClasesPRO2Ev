package Personaje;

import java.util.ArrayList;

public class ValidacionPersonaje {
	
	CreacionPersonajes cp = new CreacionPersonajes();
	
	public void analizarPiel(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(cp.personajeDef().getColorPiel() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().getColorPiel() != personaje.getColorPiel()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().getColorPiel() == personaje.getColorPiel()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarPelo(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(cp.personajeDef().getColorPelo() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().getColorPelo() != personaje.getColorPelo()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().getColorPelo() == personaje.getColorPelo()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarOjos(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(cp.personajeDef().getColorOjos() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().getColorOjos() != personaje.getColorOjos()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().getColorOjos() == personaje.getColorOjos()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarGorro(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(cp.personajeDef().getColorGorro() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().getColorGorro() != personaje.getColorGorro()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().getColorGorro() == personaje.getColorGorro()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarGafas(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		boolean valorAb;
		if(valor.toUpperCase() == "SÍ") {
			valorAb = true;
		} else {
			valorAb = false;
		}
		if(cp.personajeDef().isGafas() == valorAb) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().isGafas() != personaje.isGafas()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().isGafas() == personaje.isGafas()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarBarba(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		boolean valorAb;
		if(valor.toUpperCase() == "SÍ") {
			valorAb = true;
		} else {
			valorAb = false;
		}
		if(cp.personajeDef().isBarba() == valorAb) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().isBarba() != personaje.isBarba()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().isBarba() == personaje.isBarba()) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarPendientes(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		boolean valorAb;
		if(valor.toUpperCase() == "SÍ") {
			valorAb = true;
		} else {
			valorAb = false;
		}
		if(cp.personajeDef().isPendientes() == valorAb) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(cp.personajeDef().isPendientes() != personaje.isPendientes()) {
					personaje.setActivado(false);
				}
			} else {
				if(cp.personajeDef().isPendientes() == personaje.isPendientes()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}

}
