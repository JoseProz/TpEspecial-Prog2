package PracticoEspecial;

public class CriterioNot implements Criterio {
Criterio c1;

	public CriterioNot(Criterio n) {
		c1=n;
	}
	
	public boolean compare(Ganaderia g) {
		return (!c1.compare(g));
			
		}
}
