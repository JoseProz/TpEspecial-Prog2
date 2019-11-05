package PracticoEspecial;

public class CriterioParidosIgual implements CriterioAnimal{
	private int paridos;

	public CriterioParidosIgual(int p) {
		this.paridos=p;
	}
	
	public boolean Cumple(Animal a) {
		return (a.getParidos()== this.paridos);
	}
	
	
}
