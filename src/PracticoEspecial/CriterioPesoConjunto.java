package PracticoEspecial;

public class CriterioPesoConjunto implements CriterioConjunto {

	double peso;
	
	
	public CriterioPesoConjunto(double cc1) {
		peso=cc1;
	}
	
	public boolean Cumple(Conjunto c) {
		return c.getPromPeso()>=peso;
	}
}
