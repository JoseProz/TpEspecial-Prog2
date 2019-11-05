package PracticoEspecial;

public class CriterioParidosIgual implements Criterio{
	private int paridos;

	public CriterioParidosIgual(int p) {
		this.paridos=p;
	}
	
	public boolean compare(Ganaderia g) {
		return (g.getParidos()== this.paridos);
	}
	
	
}
