package Personaje.keyboard;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Personaje.CreacionPersonajes;
import Personaje.ValidacionPersonaje;
import recursosClass.RecursosClass;

public class Keyboard implements KeyListener{
	
	ValidacionPersonaje vp = new ValidacionPersonaje();
	CreacionPersonajes cp = new CreacionPersonajes();
			
	@Override
	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_W) {
			String ctg = RecursosClass.ventana.getActualCategoria();
			switch(ctg) {
			case "Color de Piel":
				vp.analizarPiel( cp.getListaPersonajes() ,RecursosClass.ventana.getActualValor());
				break;
			case "Color de Pelo":
				vp.analizarPelo(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Color de Ojos":
				vp.analizarOjos(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Gorra":
				vp.analizarGorro(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Gafas":
				vp.analizarGafas(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Pendientes":
				vp.analizarPendientes(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
			}
			RecursosClass.panel.repaint();
			System.out.println("he tecleado");
		}
		System.out.println("no he tecleado");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_W) {
			String ctg = RecursosClass.ventana.getActualCategoria();
			switch(ctg) {
			case "Color de Piel":
				vp.analizarPiel( cp.getListaPersonajes() ,RecursosClass.ventana.getActualValor());
				break;
			case "Color de Pelo":
				vp.analizarPelo(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Color de Ojos":
				vp.analizarOjos(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Gorra":
				vp.analizarGorro(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Gafas":
				vp.analizarGafas(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
				break;
			case "Pendientes":
				vp.analizarPendientes(cp.getListaPersonajes(), RecursosClass.ventana.getActualValor());
			}
			RecursosClass.panel.repaint();
			System.out.println("he tecleado");
		}
		
	}

}
