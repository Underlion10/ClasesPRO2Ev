package pantalla;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import recursosClass.RecursosClass;

public class Panel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 534499094065268846L;
	
	private Image img = new ImageIcon("src/Personaje/recursos/lamina.jpg").getImage();
	private Image imgQ = new ImageIcon("src/Personaje/recursos/SignoPregunta.jpg").getImage();
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 20, null);
		//Parte Inferior de izquierda/derecha
		
		if(!RecursosClass.cp.getFullFile().get(0).isActivado()) {
			g.drawImage(imgQ, 25, 195, null);
		}
		if(!RecursosClass.cp.getFullFile().get(1).isActivado()) {
			g.drawImage(imgQ, 155, 195, null);
		}
		if(!RecursosClass.cp.getFullFile().get(2).isActivado()) {
			g.drawImage(imgQ, 285, 195, null);
		}
		if(!RecursosClass.cp.getFullFile().get(3).isActivado()) {
			g.drawImage(imgQ, 415, 195, null);
		}
		if(!RecursosClass.cp.getFullFile().get(4).isActivado()) {
			g.drawImage(imgQ, 545, 195, null);
		}
		if(!RecursosClass.cp.getFullFile().get(5).isActivado()) {
			g.drawImage(imgQ, 675, 195, null);
		}
		
		//Parte Superior de izquierda/derecha
		
		if(!RecursosClass.cp.getFullFile().get(6).isActivado()) {
			g.drawImage(imgQ, 675, 20, null);
		}
		if(!RecursosClass.cp.getFullFile().get(7).isActivado()) {
			g.drawImage(imgQ, 545, 20, null);
		}
		if(!RecursosClass.cp.getFullFile().get(8).isActivado()) {
			g.drawImage(imgQ, 415, 20, null);
		}
		if(!RecursosClass.cp.getFullFile().get(9).isActivado()) {
			g.drawImage(imgQ, 285, 20, null);
		}
		if(!RecursosClass.cp.getFullFile().get(10).isActivado()) {
			g.drawImage(imgQ, 155, 20, null);
		}
		if(!RecursosClass.cp.getFullFile().get(11).isActivado()) {
			g.drawImage(imgQ, 25, 20, null);
		}
		
		repaint();
	}
	
	public Image getImg() {
		return this.img;
	}

}
