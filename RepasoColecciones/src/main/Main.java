package main;

import java.util.HashMap;

import modelo.Vendedor;
import modelo.Venta;
import modelo.dao.Modificador;

public class Main {
	
	public static void main(String[] args) {
		Modificador mod = new Modificador();
		HashMap<Venta,Vendedor> listaVentas = mod.obtenerDatosFicheros();
		System.out.println("fin");
		
	}

}
