package PracticoEspecial;

public class Animal implements Ganaderia {
	private int id;
	private int edad;
	private double peso;
	private String raza;
	private String sexo;
	private boolean capado;
	private int paridos;
	
	public Animal(int id, int ed, double p, String r, String s, boolean c, int par) {
		this.id=id;
		this.edad=ed;
		this.peso=p;
		this.raza=r;
		this.sexo=s;
		this.capado=c;
		this.paridos=par;
	}
	
	
	public int getCantAnimales() {
		return 1;
	}
	public double getPesoTotal() {
		return this.peso;
	}
	public double getPromEdad() {
		return this.edad;
	}
	public double getPromPeso() {
		return this.peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isCapado() {
		return capado;
	}

	public void setCapado(boolean capado) {
		this.capado = capado;
	}

	public int getParidos() {
		return paridos;
	}

	public void setParidos(int paridos) {
		this.paridos = paridos;
	}
	
	

}
