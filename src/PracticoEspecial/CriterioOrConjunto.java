package PracticoEspecial;

public class CriterioOrConjunto implements CriterioConjunto{
	CriterioConjunto c1;
	CriterioConjunto c2;
	
	CriterioOrConjunto(CriterioConjunto cc1, CriterioConjunto cc2){
	c1=cc1;
	c2=cc2;
	}
	
	public boolean Cumple(Conjunto j) {
		return c1.Cumple(j) || c2.Cumple(j);
	}
}
