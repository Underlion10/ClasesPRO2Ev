package Personaje;

import java.util.ArrayList;

public class ValidacionPersonaje {
	
	public void analizarPiel(ArrayList<Personaje> personajes, String valor, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(personaje.getColorPiel() != valor) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.getColorPiel() == valor) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarPelo(ArrayList<Personaje> personajes, String valor, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(personaje.getColorPelo() != valor) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.getColorPelo() == valor) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarOjos(ArrayList<Personaje> personajes, String valor, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(personaje.getColorOjos() != valor) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.getColorOjos() == valor) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarGorro(ArrayList<Personaje> personajes, String valor, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(personaje.getColorGorro() != valor) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.getColorGorro() == valor) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarGafas(ArrayList<Personaje> personajes, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(!personaje.isGafas()) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.isGafas()) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarBarba(ArrayList<Personaje> personajes, String valor, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(personaje.getColorbarba() != valor) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.getColorbarba() == valor) {
					personaje.setActivado(false);
				}
			}
		}
	}
	
	public void analizarPendientes(ArrayList<Personaje> personajes, boolean correcto) {
		for(Personaje personaje: personajes) {
			if(correcto == true) {
				if(!personaje.isPendientes()) {
					personaje.setActivado(false);
				}
			} else {
				if(personaje.isPendientes()) {
					personaje.setActivado(false);
				}
			}
		}
	}

}
