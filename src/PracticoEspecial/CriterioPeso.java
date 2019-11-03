package PracticoEspecial;

public class CriterioPeso implements Criterio {
	private double Peso;
	public CriterioPeso(double p) {
		this.Peso=p;
	}
	public boolean compare(Ganaderia g) {
		return g.getPromPeso()>=this.Peso;
	}

}
