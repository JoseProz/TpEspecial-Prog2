package PracticoEspecial;

public class CriterioNot implements CriterioAnimal {
CriterioAnimal c1;

	public CriterioNot(CriterioAnimal n) {
		c1=n;
	}
	
	public boolean Cumple(Animal g) {
		return (!c1.Cumple(g));
			
		}
}
