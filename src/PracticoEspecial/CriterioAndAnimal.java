package PracticoEspecial;

public class CriterioAndAnimal implements CriterioAnimal {
	
	CriterioAnimal c1;
	CriterioAnimal c2;
	
	public CriterioAndAnimal(CriterioAnimal cc1,CriterioAnimal cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	public boolean Cumple(Animal a) {
		return c1.Cumple(a)&& c2.Cumple(a);
	}

}
