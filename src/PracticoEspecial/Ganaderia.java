package PracticoEspecial;
import java.util.ArrayList;



public interface Ganaderia {
	public abstract int getCantAnimales(); 
	public abstract double getPesoTotal(); 
	public abstract double getPromEdad();
	public abstract double getPromPeso();
	public abstract String getRaza();
	public abstract int getEdad();
	public abstract ArrayList<Ganaderia> getAnimales();
	public abstract ArrayList<Ganaderia>filtro(Criterio c);
	public abstract ArrayList<Ganaderia>filtroXAnimal(Criterio c);
	public abstract boolean Capado();
	public abstract String getSexo();
	public abstract int getParidos();
	public abstract int getId();
	
	
	
	

}
