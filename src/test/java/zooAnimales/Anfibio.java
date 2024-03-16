package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero,
			Zona zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero,Zona zona) {
		ranas += 1;
		return new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero,Zona zona) {
		salamandras += 1;
		return new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
	}
	
	public static int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
	

}
