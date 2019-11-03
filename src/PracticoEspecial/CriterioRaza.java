package PracticoEspecial;

public class CriterioRaza implements Criterio {
private String raza;
	public CriterioRaza(String r) {
		this.raza=r;
	}
	
	public boolean compare(Ganaderia g) {
		return raza.equals(g.getRaza());
	}
}
