package PracticoEspecial;
import java.util.ArrayList;

public class Conjunto implements Ganaderia {
	ArrayList<Ganaderia>animales;
	private String nombre;

	 public Conjunto(String n) {
		 animales= new ArrayList<Ganaderia>();
		 this.nombre=n;
		 
	 }
	 public void add(Ganaderia g) {
		 animales.add(g);
	 }
	 
	public ArrayList<Ganaderia>filtro(Criterio p){
		ArrayList<Ganaderia>animalesFiltrados=new ArrayList<>();
		for(Ganaderia g:animales) {
			if(p.Cumple(g)) {
				animalesFiltrados.addAll(g.filtro(p));
			}
		}
		return animalesFiltrados;
	}
	
	@Override
	public String toString() {
		return "Conjunto=" + nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//este es el metodo para que funcione el CriterioPeso
	public double getPeso() {
		double Peso=0;
		for(Ganaderia g:animales) {
			Peso+=g.getPeso();
		}
			return Peso/animales.size();
			
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
		double peso=0;
		for(Ganaderia g: animales) {
				peso+=g.getPromPeso();
		}
		
		if(animales.size()!=0) {
			return peso/animales.size();
		}
		else {
			return 0;
		}
		
	}
	
	public double getPromEdad(){
		double edad=0;
		for(Ganaderia g: animales) {
			edad+= g.getPromEdad();
		}
		if(animales.size()!=0) {
			return edad/animales.size();
		}
		else {
			return 0;
		}
	}

}
