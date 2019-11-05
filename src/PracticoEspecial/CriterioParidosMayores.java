package PracticoEspecial;

public class CriterioParidosMayores implements CriterioAnimal {
	private int paridos;

	public CriterioParidosMayores(int p) {
		this.paridos=p;
	}
	
	public boolean Cumple(Animal a) {
		return (a.getParidos()> this.paridos);
	}
	
	
}

