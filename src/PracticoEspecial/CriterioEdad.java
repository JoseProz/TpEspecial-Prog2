package PracticoEspecial;

public class CriterioEdad implements Criterio {
	int meses;
	public CriterioEdad(int m) {
		this.meses=m;
	}
	public boolean compare(Ganaderia g) {
		return g.getPromEdad()>=this.meses;
	}
	

}
