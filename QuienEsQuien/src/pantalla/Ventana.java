package pantalla;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import Personaje.CreacionPersonajes;
import Personaje.ValidacionPersonaje;

public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 530942976231173L;
	
	JComboBox<String> partesParte = new JComboBox<String>();
	ArrayList<JComboBox<String>> actuales = new ArrayList<JComboBox<String>>();
	CreacionPersonajes cp = new CreacionPersonajes();
	ValidacionPersonaje vp = new ValidacionPersonaje();
	Button button = new Button();
	int actualNumber = 0;
	private String actualCategoria;
	private String actualValor;
	Panel panel = new Panel();

	public Ventana() {

		setSize(panel.getImg().getWidth(panel), 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		Container cn = getContentPane();
		cn.setLayout(new BorderLayout());
		cn.setFocusable(true);
		panel.setBounds(new Rectangle(25, 25, 600, 450));
		button.setLabel("Preguntar");
		button.setBounds(0, 0, 40, 10);
		partesParte.addItem("--seleccionar--");
		JComboBox<String> partes = new JComboBox<String>();
		cn.add(partes, BorderLayout.NORTH);
		cn.add(panel, BorderLayout.CENTER);
		// Pendiente
		JComboBox<String> pendiente = new JComboBox<String>();
		pendiente.addItem("--seleccionar--");
		pendiente.addItem("Sí");
		pendiente.addItem("No");
		// fin pendiente
		// Piel
		JComboBox<String> piel = new JComboBox<String>();
		piel.addItem("--seleccionar--");
		piel.addItem("Negro");
		piel.addItem("Blanco");
		// fin piel
		// Gorra
		JComboBox<String> gorra = new JComboBox<String>();
		gorra.addItem("--seleccionar--");
		gorra.addItem("Sí");
		gorra.addItem("No");
		// fin gorra
		// pelo
		JComboBox<String> pelo = new JComboBox<String>();
		pelo.addItem("--seleccionar--");
		pelo.addItem("Calvo");
		pelo.addItem("Rubio");
		pelo.addItem("Moreno");
		pelo.addItem("Pelirrojo");
		// fin pelo
		// ojos
		JComboBox<String> ojos = new JComboBox<String>();
		ojos.addItem("--seleccionar--");
		ojos.addItem("Marrones");
		ojos.addItem("Azules");
		// fin ojos
		// gafas
		JComboBox<String> gafas = new JComboBox<String>();
		gafas.addItem("--seleccionar--");
		gafas.addItem("Sí");
		gafas.addItem("No");
		// fin gafas
		// add elements to the ArrayList
		actuales.add(gafas);
		actuales.add(pelo);
		actuales.add(pendiente);
		actuales.add(gafas);
		actuales.add(ojos);
		actuales.add(piel);
		actuales.add(gorra);
		// end adding
		partes.addItem("--seleccionar--");
		partes.addItem("Color de Piel");
		partes.addItem("Color de Pelo");
		partes.addItem("Color de Ojos");
		partes.addItem("Gorra");
		partes.addItem("Gafas");
		partes.addItem("Pendientes");
		partes.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String a = (String) e.getItem();

				if (a == "Color de Piel" && e.getStateChange() == 1) {
					cn.add(piel, BorderLayout.SOUTH);
					actualCategoria = "piel";
					cn.remove(gorra);
					cn.remove(pelo);
					cn.remove(gafas);
					cn.remove(pendiente);
					cn.remove(ojos);
					System.out.println("Color de Piel");
					piel.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							String a = (String) e.getItem();
							if(a == "Negro" && e.getStateChange() == 1) {
								actualValor = "MARRON";
								System.out.println(actualCategoria + " " + actualValor);
								vp.analizarPiel(cp.getListaPersonajes(), actualValor);
							}
							if(a == "Blanco" && e.getStateChange() == 1) {
								actualValor = "BLANCO";
								System.out.println(actualCategoria + " " + actualValor);
								vp.analizarPiel(cp.getListaPersonajes(), actualValor);
							}
						}
					});
					actualNumber = 1;
				}

				if (a == "Gorra" && e.getStateChange() == 1) {
					actualCategoria = "gorra";
					cn.add(gorra, BorderLayout.SOUTH);
					gorra.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							String a = (String) e.getItem();
							if(a == "Sí" && e.getStateChange() == 1) {
								actualValor = "Sí";
								gorra.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "No" && e.getStateChange() == 1) {
								actualValor = "No";
								gorra.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
						}
					});
					cn.remove(piel);
					cn.remove(pelo);
					cn.remove(gafas);
					cn.remove(pendiente);
					cn.remove(ojos);
					actualNumber = 2;
				}

				if (a == "Color de Pelo" && e.getStateChange() == 1) {
					actualCategoria = "pelo";
					cn.add(pelo, BorderLayout.SOUTH);
					pelo.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							String a = (String) e.getItem();
							if(a == "Calvo" && e.getStateChange() == 1) {
								actualValor = "Calvo";
								pelo.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "Rubio" && e.getStateChange() == 1) {
								actualValor = "Rubio";
								pelo.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "Moreno" && e.getStateChange() == 1) {
								actualValor = "Moreno";
								pelo.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "Pelirrojo" && e.getStateChange() == 1) {
								actualValor = "Pelirrojo";
								pelo.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
						}
					});
					cn.remove(piel);
					cn.remove(gorra);
					cn.remove(gafas);
					cn.remove(pendiente);
					cn.remove(ojos);
					actualNumber = 3;
				}

				if (a == "Color de Ojos" && e.getStateChange() == 1) {
					cn.add(ojos, BorderLayout.SOUTH);
					actualCategoria = "ojos";
					ojos.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							String a = (String) e.getItem();
							if(a == "Marrones" && e.getStateChange() == 1) {
								actualValor = "Marrones";
								ojos.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "Azules" && e.getStateChange() == 1) {
								actualValor = "Azules";
								ojos.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
						}
					});
					cn.remove(piel);
					cn.remove(pelo);
					cn.remove(gafas);
					cn.remove(pendiente);
					cn.remove(gorra);
					actualNumber = 4;
				}

				if (a == "Gafas" && e.getStateChange() == 1) {
					cn.add(gafas, BorderLayout.SOUTH);
					actualCategoria = "gafas";
					gafas.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							String a = (String) e.getItem();
							if(a == "Sí" && e.getStateChange() == 1) {
								actualValor = "Sí";
								gafas.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "No" && e.getStateChange() == 1) {
								actualValor = "No";
								gafas.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
						}
					});
					cn.remove(piel);
					cn.remove(pelo);
					cn.remove(gorra);
					cn.remove(pendiente);
					cn.remove(ojos);
					actualNumber = 5;
				}

				if (a == "Pendientes" && e.getStateChange() == 1) {
					actualCategoria = "pendientes";
					pendiente.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							String a = (String) e.getItem();
							if(a == "Sí" && e.getStateChange() == 1) {
								actualValor = "Sí";
								pendiente.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
							if(a == "No" && e.getStateChange() == 1) {
								actualValor = "No";
								pendiente.setSelectedIndex(0);
								System.out.println(actualCategoria + " " + actualValor);
							}
						}
					});
					cn.add(pendiente, BorderLayout.SOUTH);
					cn.remove(piel);
					cn.remove(pelo);
					cn.remove(gafas);
					cn.remove(gorra);
					cn.remove(ojos);
					actualNumber = 6;
				}
				cn.validate();
				System.out.println(actualNumber);
			}
		});
	}

	public String getActualCategoria() {
		return actualCategoria;
	}

	public void setActualCategoria(String actualCategoria) {
		this.actualCategoria = actualCategoria;
	}

	public String getActualValor() {
		return actualValor;
	}

	public void setActualValor(String actualValor) {
		this.actualValor = actualValor;
	}
}
