package PracticoEspecial;
import java.util.ArrayList;

public class Camion {
	private int id;
	private int capacidad;
	ArrayList<Criterio>condiciones;
	ArrayList<Ganaderia>animales;
	
	public Camion(int id,int c) {
		this.id=id;
		this.capacidad=c;
		condiciones= new ArrayList<Criterio>();
		animales=new ArrayList<Ganaderia>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public ArrayList<Criterio> getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(ArrayList<Criterio> condiciones) {
		this.condiciones = condiciones;
	}

	public ArrayList<Ganaderia> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Ganaderia> animales) {
		this.animales = animales;
	}

	public void addCriterio(Criterio c) {
		condiciones.add(c);
	}
	@Override
	public String toString() {
		return "Camion [id=" + id + ", capacidad=" + capacidad + ", animales=" + animales + "]";
	}

	public void addAnimal(Ganaderia g) {
		ArrayList<Ganaderia> lista=new ArrayList<Ganaderia>();
		for(Criterio c: condiciones) {
			lista=g.filtroXAnimal(c);
			for(int i=0;i<lista.size();i++) {
				
			if(animales.size()<capacidad) {
					animales.add(lista.get(i));
			}
			
			}
		}
		
	}
	
	
	

}