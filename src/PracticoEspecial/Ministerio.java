package PracticoEspecial;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Ministerio {
	String nombre;
	ArrayList<Categoria>categorias;
	ArrayList<Ganaderia>animales;
	public Ministerio(String n) {
		this.nombre= n;
		categorias=new ArrayList<Categoria>();
		animales=new ArrayList<Ganaderia>();
	}
	public void addCategoria(Categoria c) {
		categorias.add(c);
	}
	public ArrayList<Ganaderia>Categorizar(Ganaderia g){
		ArrayList<Ganaderia>animales=new ArrayList<Ganaderia>();
		Set<Ganaderia>lista=new HashSet<Ganaderia>();
		for(Categoria c: categorias) {
			animales.addAll(g.filtroXAnimal(c.getC1()));
			lista.addAll(animales);
			animales.clear();
			animales.addAll(lista);
			if(c.CumpleCriterio(g)) {
			animales.add(g);
			}
		}
		return animales;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public ArrayList<Ganaderia> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Ganaderia> animales) {
		this.animales = animales;
	}
	@Override
	public String toString() {
		return "Ministerio categorias=" + categorias+ animales;
	}
	

}
