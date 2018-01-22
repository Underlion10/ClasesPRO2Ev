package pantalla;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Personaje.CreacionPersonajes;
import Personaje.Personaje;

public class Panel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 534499094065268846L;
	
	private Image img = new ImageIcon("src/Personaje/recursos/lamina.jpg").getImage();
	private Image imgQ = new ImageIcon("src/Personaje/recursos/SignoPregunta.jpg").getImage();
	CreacionPersonajes creacion = new CreacionPersonajes();
	ArrayList<Personaje> personajes = creacion.leerFichero();
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
		
		//Parte Inferior de izquierda/derecha
		
		if(!personajes.get(0).isActivado()) {
			g.drawImage(imgQ, 25, 195, null);
		}
		if(!personajes.get(1).isActivado()) {
			g.drawImage(imgQ, 155, 195, null);
		}
		if(!personajes.get(2).isActivado()) {
			g.drawImage(imgQ, 285, 195, null);
		}
		if(!personajes.get(3).isActivado()) {
			g.drawImage(imgQ, 415, 195, null);
		}
		if(!personajes.get(4).isActivado()) {
			g.drawImage(imgQ, 545, 195, null);
		}
		if(!personajes.get(5).isActivado()) {
			g.drawImage(imgQ, 675, 195, null);
		}
		
		//Parte Superior de izquierda/derecha
		
		if(!personajes.get(6).isActivado()) {
			g.drawImage(imgQ, 675, 20, null);
		}
		if(!personajes.get(7).isActivado()) {
			g.drawImage(imgQ, 545, 20, null);
		}
		if(!personajes.get(8).isActivado()) {
			g.drawImage(imgQ, 415, 20, null);
		}
		if(!personajes.get(9).isActivado()) {
			g.drawImage(imgQ, 285, 20, null);
		}
		if(!personajes.get(10).isActivado()) {
			g.drawImage(imgQ, 155, 20, null);
		}
		if(!personajes.get(11).isActivado()) {
			g.drawImage(imgQ, 25, 20, null);
		}
	}
	
	public Image getImg() {
		return this.img;
	}

}
