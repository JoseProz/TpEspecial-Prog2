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
			ArrayList<Animal> ListaAnimales = new ArrayList<Animal>() ;
			for (Ganaderia g : animales){
				animales.addAll(g.getAnimales());
			}
			return ListaAnimales;
		}
	
	public void add(Ganaderia g) {
		 animales.add(g);
	 }
	 
	public ArrayList<Ganaderia>filtro(Criterio p){
		ArrayList<Ganaderia>animalesFiltrados=new ArrayList<>();
		for(Ganaderia g:animales) {
			if(p.compare(g)) {
				animalesFiltrados.addAll(g.filtro(p));
			}
		}
		return animalesFiltrados;
	}
	
	public ArrayList<Ganaderia> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Ganaderia> animales) {
		this.animales = animales;
	}
	//filtro unitario
	public ArrayList<Ganaderia>filtroXAnimal(Criterio p){
		ArrayList<Ganaderia>animalesFiltrados=new ArrayList<>();
		for(Ganaderia g:animales) {
				animalesFiltrados.addAll(g.filtroXAnimal(p));
			}
		return animalesFiltrados;
	}
	public String getRaza() {
		return nombre;
	}
	public boolean Capado() {
		return this.Capado();
	}
	
	public int getEdad() {
		return this.getEdad();
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
	public String getSexo() {
		return getSexo();
	}
	public int getId() {
	return getId();	
	}
	
	public int getParidos() {
		return getParidos();
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
	//este es el metodo para que funcione el CriterioPeso
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
	public boolean darDeBaja(Integer i) {
		boolean aux = false;
		for (int j =0;j<animales.size();j++) {	
			if (animales.get(j).darDeBaja(i)) {
				animales.remove(animales.get(j));
				aux = true;
			}
		}
		return aux;
		
		
					
	}

}
