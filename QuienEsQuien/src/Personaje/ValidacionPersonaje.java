package Personaje;

import java.util.ArrayList;

import recursosClass.RecursosClass;

public class ValidacionPersonaje {
	
	
	public void analizarPiel(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(RecursosClass.cp.personajeDef().getColorPiel() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().getColorPiel() != personaje.getColorPiel()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().getColorPiel() == personaje.getColorPiel()) {
					personaje.setActivado(false);
				}	
			}
		}
		RecursosClass.cp.setListaPersonajes(personajes);
		for(Personaje personaje: personajes) {
			System.out.println(personaje.isActivado());
		}
	}
	
	public void analizarPelo(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(RecursosClass.cp.personajeDef().getColorPelo() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().getColorPelo() != personaje.getColorPelo()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().getColorPelo() == personaje.getColorPelo()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarOjos(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(RecursosClass.cp.personajeDef().getColorOjos() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().getColorOjos() != personaje.getColorOjos()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().getColorOjos() == personaje.getColorOjos()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}
	
	public void analizarGorro(ArrayList<Personaje> personajes, String valor) {
		boolean correcto;
		if(RecursosClass.cp.personajeDef().getColorGorro() == valor.toUpperCase()) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().getColorGorro() != personaje.getColorGorro()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().getColorGorro() == personaje.getColorGorro()) {
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
		if(RecursosClass.cp.personajeDef().isGafas() == valorAb) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().isGafas() != personaje.isGafas()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().isGafas() == personaje.isGafas()) {
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
		if(RecursosClass.cp.personajeDef().isBarba() == valorAb) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().isBarba() != personaje.isBarba()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().isBarba() == personaje.isBarba()) {
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
		if(RecursosClass.cp.personajeDef().isPendientes() == valorAb) {
			correcto = true;
		} else {
			correcto = false;
		}
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(RecursosClass.cp.personajeDef().isPendientes() != personaje.isPendientes()) {
					personaje.setActivado(false);
				}
			} else {
				if(RecursosClass.cp.personajeDef().isPendientes() == personaje.isPendientes()) {
					personaje.setActivado(false);
				}
				
			}
		}
	}

}
