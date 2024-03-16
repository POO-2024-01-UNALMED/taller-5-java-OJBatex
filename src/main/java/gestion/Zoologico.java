package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico () {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.setUbicacion(ubicacion);
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		
		int cantAnimales = 0;
		for (int i = 0; i < zonas.size(); i++) {
			cantAnimales += zonas.get(i).cantidadAnimales();
		}
		
		return cantAnimales;
		
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public String getNombre() {
		return nombre;

	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
		

}