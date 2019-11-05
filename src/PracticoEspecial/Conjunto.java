package PracticoEspecial;
import java.util.ArrayList;

public class Conjunto implements Ganaderia {
	ArrayList<Ganaderia>animales;
	private String nombre;

	 public Conjunto(String n) {
		 animales= new ArrayList<Ganaderia>();
		 this.nombre=n;
		 
	 }
	 public ArrayList<Animal> getListaAnimales() {
			ArrayList<Animal> ListaAnimales = new ArrayList<>() ;
			for (Ganaderia g : animales){
				ListaAnimales.addAll(g.getListaAnimales());
			}
			return ListaAnimales;
		}
	
	public void add(Ganaderia g) {
		 animales.add(g);
	 }
	 
	public ArrayList<Animal>buscar(CriterioAnimal p){
		ArrayList<Animal>animalesFiltrados=new ArrayList<>();
		for(Ganaderia g:animales) {
				animalesFiltrados.addAll(g.buscar(p));
			}
		return animalesFiltrados;
	}
	
	public ArrayList<Ganaderia> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Ganaderia> animales) {
		this.animales = animales;
	}
	
	
	public boolean listoVender(CriterioConjunto p){
		return p.Cumple(this);
	}
	
	@Override
	public String toString() {
		return "Conjunto=" + nombre +" "+ animales.toString() ;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*public ArrayList<Ganaderia>filtroPesoXanimal(Criterio p){
		ArrayList<Ganaderia>animalesFiltrados=new ArrayList<>();
		for(Ganaderia g:animales) {
			if(p.Cumple(g)) {
				animalesFiltrados.addAll(g.filtroPesoXanimal(p));
			}
		}
		return animalesFiltrados;
	}*/
	
	public int getEdadTotal() {
		int edad=0;
		for(Ganaderia g:animales) {
			edad+=g.getEdadTotal();
		}
		return edad;
	}
	
	public int getCantAnimales() {
		int suma=0;
		for(Ganaderia g: animales) {
			suma+=g.getCantAnimales();
		}
		return suma;
	}
	
	public double getPesoTotal() {
		double peso=0;
		for(Ganaderia g: animales) {
			peso+=g.getPesoTotal();
		}
		 return peso;
		
	}
	
	public double getPromPeso() {
		
		if(animales.size()!=0) {
			return this.getPesoTotal() /this.getCantAnimales();
		}
		else {
			return 0;
		}
		
	}

	
	public double getPromEdad(){
			
			if(animales.size()!=0) {
			return this.getEdadTotal()/this.getCantAnimales();
		}
		else {
			return 0;
		}
	}
	
	public ArrayList<Animal> CargarCamion(Camion c, CriterioAnimal r){
		ArrayList<Animal> aux = new ArrayList<>();
		for (Ganaderia g: animales) {
			 aux.addAll( g.CargarCamion(c, r));
		}
		return aux;
		
	}


}
