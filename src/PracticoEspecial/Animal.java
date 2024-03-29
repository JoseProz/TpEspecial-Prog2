package PracticoEspecial;

import java.util.ArrayList;

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
	public ArrayList<Animal>getListaAnimales(){
		ArrayList<Animal> an = new ArrayList<Animal>();
		an.add(this);
		return an;
	}
	
	/*public ArrayList<Ganaderia>filtroPesoXanimal(Criterio p){
		ArrayList<Ganaderia>animalesFiltrados=new ArrayList<>();
			if(p.compare(this)) {
				animalesFiltrados.add(this);
			}
		return animalesFiltrados;
	}*/
	
	public boolean Capado() {
		return this.capado;
		
	}
	
	
	public ArrayList<Animal>buscar(CriterioAnimal p){
		ArrayList<Animal>animalesFiltrados=new ArrayList<>();
		
			if(p.Cumple(this)) {
				animalesFiltrados.add(this);
			}
		return animalesFiltrados;
	}
	
	public int getCantAnimales() {
		return 1;
	}
	public double getPesoTotal() {
		return this.peso;
	}
	public int getEdadTotal() {
		return this.edad;
	}

	public Integer getId() {
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

	@Override
	public String toString() {
		return "Animal id=" + id + ", raza=" + raza;
	}


	public void setPesoTotal(double peso) {
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

	public ArrayList<Animal> CargarCamion(Camion c, CriterioAnimal r){
		ArrayList<Animal> aux = new ArrayList<>();
		if (r.Cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
	

}
