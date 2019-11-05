package PracticoEspecial;

public class CriterioSexoAnimal implements CriterioAnimal {
private String sexo;
	public CriterioSexoAnimal(String s) {
		this.sexo=s;
	}
	
	public boolean Cumple(Animal a) {
		return sexo.equals(a.getSexo());
	}

}
