package PracticoEspecial;

public class CriterioPeso implements Criterio {
	private double Peso;
	public CriterioPeso(double p) {
		this.Peso=p;
	}
	public boolean Cumple(Ganaderia g) {
		return g.getPeso()>=this.Peso;
	}

}
