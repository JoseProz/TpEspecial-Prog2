package PracticoEspecial;

public class CriterioPesoAnimal implements CriterioAnimal {
	private double Peso;
	public CriterioPesoAnimal(double p) {
		this.Peso=p;
	}
	public boolean Cumple(Animal j) {
		return j.getPesoTotal()>=this.Peso;
	}

}
