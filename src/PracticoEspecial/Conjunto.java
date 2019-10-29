package PracticoEspecial;
import java.util.ArrayList;

public class Conjunto implements Ganaderia {
	ArrayList<Ganaderia>animales;

	 public Conjunto() {
		 animales= new ArrayList<Ganaderia>();
		 
	 }
	 public void add(Ganaderia g) {
		 animales.add(g);
	 }
	 
	public ArrayList<Ganaderia>PesoMayorA(CriterioPeso p){
		ArrayList<Ganaderia>animalesPeso=new ArrayList<>();
		for(Ganaderia g:animales) {
			if(p.Cumple(g)) {
				animalesPeso.add(g);
			}
		}
		return animalesPeso;
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
