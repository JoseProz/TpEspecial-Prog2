package PracticoEspecial;

public class CriterioRazaAnimal implements CriterioAnimal {
private String raza;
	public CriterioRazaAnimal(String r) {
		this.raza=r;
	}
	
	public boolean Cumple(Animal a) {
		return raza.equals(a.getRaza());
	}
}
