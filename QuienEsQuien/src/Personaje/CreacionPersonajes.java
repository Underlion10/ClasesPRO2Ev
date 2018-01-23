package Personaje;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CreacionPersonajes {
	
	private ArrayList<Personaje> listaPersonajes = new ArrayList<Personaje>();
	
	public Personaje personajeDef() {
		ArrayList<Personaje> personajes = leerFichero();
		return personajes.get(new Random().nextInt(12));
	}
	
	public ArrayList<Personaje> leerFichero() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/Personaje/recursos/personajes.txt"));
			String linea;
			while((linea = br.readLine()) != null) {
				String[] partsPer = linea.split("-");
				String nombre = partsPer[0];
				String colorPiel = partsPer[1];
				String colorPelo = partsPer[2];
				String colorOjos = partsPer[3];
				String gafas = partsPer[4];
				boolean glasses;
				if(gafas.startsWith("NO")){
					glasses = false;
				} else {
					glasses = true;
				}
				boolean gorro;
				String colorGorro = "";
				if(partsPer[5].startsWith("NO")){
					gorro = false;
				} else {
					gorro = true;
					colorGorro = partsPer[5].substring(2);
				}
				
				boolean bigote;
				String colorbigote = "";
				if(partsPer[6].startsWith("NO")){
					bigote = false;
				} else {
					bigote = true;
					colorbigote = partsPer[6].substring(2);
				}
				
				boolean barba;
				String colorBarba = "";
				if(partsPer[7].startsWith("NO")){
					barba = false;
				} else {
					barba = true;
					colorBarba = partsPer[7].substring(2);
					
				}
				
				boolean pendientes;
				if(gafas.startsWith("NO")){
					pendientes = false;
				} else {
					pendientes = true;
				}
				
				Personaje personajeNuevo = new Personaje(nombre, colorPiel, colorPelo, 
						colorOjos, glasses, gorro ,colorGorro
						, bigote, colorbigote, barba, colorBarba, pendientes, true);
				listaPersonajes.add(personajeNuevo);
			}
			br.close();	
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return listaPersonajes;
	}
	
	public ArrayList<Personaje> getListaPersonajes() {
		return this.listaPersonajes;
	}
	
	public void setListaPersonajes(ArrayList<Personaje> listaPersonajes) {
		this.listaPersonajes = listaPersonajes;
	}
}
