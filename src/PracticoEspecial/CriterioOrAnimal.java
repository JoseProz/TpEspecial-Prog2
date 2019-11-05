package PracticoEspecial;

public class CriterioOrAnimal implements CriterioAnimal{
	CriterioAnimal c1;
	CriterioAnimal c2;
	
	public CriterioOrAnimal(CriterioAnimal cc1,CriterioAnimal cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	public boolean Cumple(Animal a) {
		return c1.Cumple(a)|| c2.Cumple(a);
	}

}

