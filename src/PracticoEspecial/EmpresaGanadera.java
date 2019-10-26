package PracticoEspecial;

public class EmpresaGanadera {

	public static void main(String[] args) {
		Conjunto empresa=new Conjunto();
		
		Conjunto rodeo=new Conjunto();
		Conjunto rebaño= new Conjunto();
		
		
		Animal vacaLola= new Animal(0, 1, 400, "Holando", "Hembra", false, 2);
		Animal toroLolo= new Animal(1, 3, 450, "jjj", "Macho", true, 0);
		Animal vacaAura= new Animal(2, 2, 300, "fff", "Hembra", false, 4);
		Animal vacaChiva= new Animal(3, 1, 200, "uuu", "Hembra", false, 0);
		Animal toroAuro= new Animal(4, 5, 600, "toruno", "Macho", false, 0);
		Animal vacaTrina= new Animal(5, 2, 400, "muuu", "Hembra", false, 2);
		Animal vacaLupa= new Animal(6, 4, 500, "waaa", "Hembra", false, 5);
		
		rebaño.add(vacaLola);
		rebaño.add(toroLolo);
		rodeo.add(vacaChiva);
		rodeo.add(toroAuro);
		rodeo.add(vacaTrina);
		
		empresa.add(rodeo);
		empresa.add(rebaño);
		empresa.add(vacaAura);
		empresa.add(vacaLupa);
		
		double edad=rodeo.getPesoTotal();
		System.out.println(edad);
	}

}
