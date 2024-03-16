package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero,
				Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		
		listado.add(this);
	}
	
	public Ave crearHalcon(String nombre, int edad, String genero,Zona zona) {
		halcones += 1;
		return new Ave(nombre, edad, "montanas", genero, zona, "cafe glorioso");
	}
	
	public Ave crearAugila(String nombre, int edad, String genero,Zona zona) {
		aguilas += 1;
		return new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarilo");
	}
	
	public static int cantidadAves() {
		return halcones + aguilas;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	

}
