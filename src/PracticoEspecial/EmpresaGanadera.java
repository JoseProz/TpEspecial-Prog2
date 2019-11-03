package PracticoEspecial;

public class EmpresaGanadera {

	public static void main(String[] args) {
		Conjunto empresa=new Conjunto("empresa");
		Conjunto multi=new Conjunto("multi");
		
		Conjunto rodeo=new Conjunto("rodeo");
		Conjunto rebanio= new Conjunto("rebaño");
		Conjunto manada= new Conjunto("manada");
		
		
		Animal vacaLola= new Animal(0, 1, 650, "Holando", "Hembra", false, 2);
		Animal toroLolo= new Animal(1, 4, 800, "Holando", "Macho", true, 0);
		Animal vacaAura= new Animal(2, 2, 600, "fff", "Hembra", false, 4);
		Animal vacaChiva= new Animal(3, 1, 800, "uuu", "Hembra", false, 0);
		Animal toroAuro= new Animal(4, 5, 600, "toruno", "Macho", false, 0);
		Animal vacaTrina= new Animal(5, 2, 400, "muuu", "Hembra", false, 2);
		Animal vacaLupa= new Animal(6, 4, 500, "waaa", "Hembra", false, 5);
		Animal v1= new Animal(7, 3, 690, "Holando", "Hembra", false, 3);
		Animal v2= new Animal(8, 5, 800, "hhh", "Hembra", false, 2);
		Animal v3= new Animal(9, 5, 600, "Holando", "Hembra", false, 1);
		Animal v4= new Animal(10, 1, 300, "ppp", "Macho", true, 0);
		Animal v5= new Animal(11, 7, 800, "Toro", "Macho", false, 0);
		Animal v6= new Animal(12, 2, 700, "Holando", "Hembra", false, 2);
		
		manada.add(v1);
		manada.add(v2);
		manada.add(v3);
		manada.add(v4);
		manada.add(v5);
		manada.add(v6);
		rebanio.add(vacaLola);
		rebanio.add(toroLolo);
		rodeo.add(vacaChiva);
		rodeo.add(toroAuro);
		rodeo.add(vacaTrina);
		
		empresa.add(manada);
		empresa.add(rodeo);
		empresa.add(rebanio);
		empresa.add(vacaAura);
		empresa.add(vacaLupa);
		multi.add(empresa);
		
		//double edad=rodeo.getPesoTotal();
		//System.out.println(edad);
		CriterioPeso  peso= new CriterioPeso(648);
		//System.out.println(empresa.filtro(or));
		//CPesoXAnimal  peso= new CPesoXAnimal(600);
		//System.out.println(multi.filtroXAnimal(peso));
		CriterioRaza raza= new CriterioRaza("Holando");
		CriterioEdad edad= new CriterioEdad(3);
		//System.out.println(multi.filtroXAnimal(raza));
		//CriterioOrXAnimal orA=new CriterioOrXAnimal(800, 5);
		//System.out.println(multi.filtroXAnimal(orA));
		Camion camion= new Camion(0, 3);
		CriterioAnd and=new CriterioAnd(peso, edad);
		camion.addCriterio(and);
		//camion.addCriterio(raza);;
		camion.addAnimal(empresa);
			
		System.out.println(camion.getAnimales());

	}

}
