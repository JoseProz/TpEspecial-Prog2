package PracticoEspecial;
import java.util.ArrayList;



public interface Ganaderia {
	public abstract int getCantAnimales(); 
	public abstract double getPesoTotal(); 
	public abstract int getEdadTotal();
	public abstract ArrayList<Animal>getListaAnimales();
	//public abstract ArrayList<Ganaderia> getAnimales();
	public abstract ArrayList<Animal>buscar(CriterioAnimal c);
	public abstract ArrayList<Animal> CargarCamion(Camion c, CriterioAnimal r);
	//public abstract ArrayList<Ganaderia>filtroXAnimal(Criterio c);
	//public abstract boolean darDeBaja(Integer i);
	
	
	

}
