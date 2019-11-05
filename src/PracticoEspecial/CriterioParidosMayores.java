package PracticoEspecial;

public class CriterioParidosMayores implements Criterio {
	private int paridos;

	public CriterioParidosMayores(int p) {
		this.paridos=p;
	}
	
	public boolean compare(Ganaderia g) {
		return (g.getParidos()> this.paridos);
	}
	
	
}

