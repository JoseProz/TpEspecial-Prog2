package PracticoEspecial;

public class CriterioAnd implements Criterio{
	Criterio c1;
	Criterio c2;
	
		public CriterioAnd(Criterio cc1, Criterio cc2) {
			c1=cc1;
			c2=cc2;
		}
		public boolean compare(Ganaderia g) {
			return ((c1.compare(g))&&(c2.compare(g)));
		}
	

}
