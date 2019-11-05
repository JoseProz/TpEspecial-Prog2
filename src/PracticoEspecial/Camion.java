package PracticoEspecial;


public class Camion {
	private int id;
	private int capacidad;
	CriterioAnimal condiciones;
	Conjunto animales;
	
	public Camion(int id,int c,CriterioAnimal criterio) {
		this.id=id;
		this.capacidad=c;
		condiciones = criterio;
		animales=null;
	}
	
	

	

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public CriterioAnimal getCondiciones() {
		return condiciones;
	}

	

	public Conjunto getAnimales() {
		return animales;
	}

	public void setAnimales(Conjunto animales) {
		this.animales = animales;
	}
	@Override
	public String toString() {
		return "Camion [id=" + id + ", capacidad=" + capacidad + ", animales=" + animales + "]";
	}
	public void cargar(Animal a) {
		if (animales.getCantAnimales() <= this.capacidad) {
			animales.add(a);
			}
		}
			
		
		

	
		
  }
		
		
	
	

