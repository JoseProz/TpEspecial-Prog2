package PracticoEspecial;

public class CriterioEdadAnimal implements CriterioAnimal{
int edad;


	public CriterioEdadAnimal(int cc1) {
		edad=cc1;
	}
	public boolean Cumple(Animal a) {
		return a.getEdad()>=edad;
	}
}
