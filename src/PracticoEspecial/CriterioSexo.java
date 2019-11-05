package PracticoEspecial;

public class CriterioSexo implements Criterio {
private String sexo;
	public CriterioSexo(String s) {
		this.sexo=s;
	}
	
	public boolean compare(Ganaderia g) {
		return sexo.equals(g.getSexo());
	}

}
