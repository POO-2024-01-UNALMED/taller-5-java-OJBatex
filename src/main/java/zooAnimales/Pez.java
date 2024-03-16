package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
		}
	
	public Pez(String nombre, int edad, String habitat, String genero,
			Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public Pez crearSalmon(String nombre, int edad, String genero,Zona zona) {
		salmones += 1;
		return new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
	}
	
	public Pez crearBacalao(String nombre, int edad, String genero,Zona zona) {
		bacalaos += 1;
		return new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
	}
	
	public static int cantidadPeces() {
		return salmones + bacalaos;
	}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	

}