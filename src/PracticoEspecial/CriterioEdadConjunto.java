package PracticoEspecial;

public class CriterioEdadConjunto implements CriterioConjunto {
	int meses;
	public CriterioEdadConjunto(int m) {
		this.meses=m;
	}
	public boolean Cumple(Conjunto j) {
		return j.getPromEdad()>=this.meses;
	}
	

}
