package PracticoEspecial;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

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
	public void cargarCamion(Animal a) {
		animales.add(a);
	}

	public void CargarAnimal(Conjunto j) {
		ArrayList<Animal> AnimalesCamion = new ArrayList<Animal>();
		AnimalesCamion = j.getListaAnimales();
		int indice = 0;
		int capacidad = 0;
		
		
		while (capacidad<this.getCapacidad() && indice<AnimalesCamion.size()) {
			for(Criterio c:condiciones) {
			if (c.compare(AnimalesCamion.get(indice))) {
				this.cargarCamion(AnimalesCamion.get(indice));
				
						
				j.darDeBaja(AnimalesCamion.get(indice).getId());
				indice++;
				capacidad++;
			}else{
				indice++;
			}
		}
		
		}	
		
		
		
		
		
		
		
		
		/*for(Criterio c: condiciones) {
			lista.addAll(g.filtroXAnimal(c));
			
			}
			//antiduplicado.addAll(lista);
			//lista.clear();
			//lista.addAll(antiduplicado);
			
			for(int i=0;i<lista.size();i++) {
			if(animales.size()<capacidad) {
					animales.add(lista.get(i));
					
				}
			
			}*/
		}
	public void EliminarAnimales(ArrayList<Ganaderia> n) {
		
		
	}
	
}
		
		
	
	

