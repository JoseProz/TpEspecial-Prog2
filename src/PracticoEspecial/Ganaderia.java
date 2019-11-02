package PracticoEspecial;
import java.util.ArrayList;

public interface Ganaderia {
	public abstract int getCantAnimales(); 
	public abstract double getPesoTotal(); 
	public abstract double getPromEdad();
	public abstract double getPromPeso();
	public abstract double getPeso();
	public abstract ArrayList<Ganaderia>filtro(Criterio c);
	
	

}
