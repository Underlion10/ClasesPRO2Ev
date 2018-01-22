package modelo.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import modelo.Vendedor;
import modelo.Venta;

public class Modificador {
	
	public HashMap<Venta, Vendedor>obtenerDatosFicheros() {
	HashMap<Venta,Vendedor> mapaVentasVendedores = new HashMap<Venta, Vendedor>();
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		
	try {
		BufferedReader br = new BufferedReader(new FileReader("ficheros/ventasDeptoAlmacen.txt"));
		String linea;
		while((linea = br.readLine()) != null) {
			String[] datos = linea.split("%");
			String fechaVenta = datos[0];
			LocalDate fechaVentadef = LocalDate.of(Integer.parseInt(fechaVenta.substring(4, 8)), 
					Integer.parseInt(fechaVenta.substring(2, 4)), Integer.parseInt(fechaVenta.substring(0, 2)));
			String codigoVendedor = datos[1];
			Float importe = Float.parseFloat(datos[2]);
			Vendedor vendedor = new Vendedor(codigoVendedor, importe);
			if(mapaVentasVendedores.containsValue(vendedor)) {
				vendedor.setImporteTotal(vendedor.getImporteTotal() + importe);
				continue;
			} else {
				Venta venta = new Venta(vendedor, fechaVentadef, importe);
				ventas.add(new Venta(vendedor, fechaVentadef, importe));
				mapaVentasVendedores.put(venta, vendedor);
			}
		}
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	
	return mapaVentasVendedores;
	
	}

}
