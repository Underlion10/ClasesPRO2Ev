package Personaje;

public class Personaje {
	
	private String nombre;
	private String colorPiel;
	private String colorPelo;
	private String ColorOjos;
	private boolean gafas;
	private boolean gorro;
	private String colorGorro;
	private boolean bigote;
	private String colorbigote;
	private boolean barba;
	private String colorbarba;
	private boolean pendientes;
	private boolean activado;

	public Personaje(String nombre, String colorPiel, String colorPelo, String colorOjos, boolean gafas,
			boolean gorro, String colorGorro, boolean bigote, String colorbigote, boolean barba,
			String colorbarba, boolean pendientes, boolean activado) {
		this.nombre = nombre;
		this.colorPiel = colorPiel;
		this.colorPelo = colorPelo;
		this.ColorOjos = colorOjos;
		this.gafas = gafas;
		this.gorro = gorro;
		this.colorGorro = colorGorro;
		this.bigote = bigote;
		this.colorbigote = colorbigote;
		this.barba = barba;
		this.colorbarba = colorbarba;
		this.pendientes = pendientes;
		this.activado = activado;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public String getColorOjos() {
		return ColorOjos;
	}

	public void setColorOjos(String colorOjos) {
		ColorOjos = colorOjos;
	}

	public boolean isGafas() {
		return gafas;
	}

	public void setGafas(boolean gafas) {
		this.gafas = gafas;
	}

	public boolean isGorro() {
		return gorro;
	}

	public void setGorro(boolean gorro) {
		this.gorro = gorro;
	}

	public String getColorGorro() {
		return colorGorro;
	}

	public void setColorGorro(String colorGorro) {
		this.colorGorro = colorGorro;
	}

	public boolean isBigote() {
		return bigote;
	}

	public void setBigote(boolean bigote) {
		this.bigote = bigote;
	}

	public String getColorbigote() {
		return colorbigote;
	}

	public void setColorbigote(String colorbigote) {
		this.colorbigote = colorbigote;
	}

	public boolean isBarba() {
		return barba;
	}

	public void setBarba(boolean barba) {
		this.barba = barba;
	}

	public String getColorbarba() {
		return colorbarba;
	}

	public void setColorbarba(String colorbarba) {
		this.colorbarba = colorbarba;
	}

	public boolean isPendientes() {
		return pendientes;
	}

	public void setPendientes(boolean pendientes) {
		this.pendientes = pendientes;
	}
	
	public boolean isActivado() {
		return activado;
	}
	
	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	
}
