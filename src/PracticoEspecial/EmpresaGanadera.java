package PracticoEspecial;

public class EmpresaGanadera {

	public static void main(String[] args) {
		Conjunto empresa=new Conjunto("empresa");
		Conjunto multi=new Conjunto("multi");
		
		Conjunto rodeo=new Conjunto("rodeo");
		Conjunto rebanio= new Conjunto("reba�o");
		Conjunto manada= new Conjunto("manada");
		
		
		Animal vacaLola= new Animal(0, 12, 650, "Holando", "Hembra", false, 2);
		Animal toroLolo= new Animal(1, 48, 800, "Holando", "Macho", true, 0);
		Animal vacaAura= new Animal(2, 24, 600, "fff", "Hembra", false, 4);
		Animal vacaChiva= new Animal(3, 12, 800, "uuu", "Hembra", false, 0);
		Animal toroAuro= new Animal(4, 60, 600, "toruno", "Macho", false, 0);
		Animal vacaTrina= new Animal(5, 24, 400, "muuu", "Hembra", false, 2);
		Animal vacaLupa= new Animal(6, 48, 500, "waaa", "Hembra", false, 5);
		Animal v1= new Animal(7, 36, 690, "Holando", "Hembra", false, 3);
		Animal v2= new Animal(8, 60, 800, "hhh", "Hembra", false, 2);
		Animal v3= new Animal(9, 60, 600, "Holando", "Hembra", false, 1);
		Animal v4= new Animal(10, 12, 300, "ppp", "Macho", true, 0);
		Animal v5= new Animal(11, 84, 800, "Toro", "Macho", false, 0);
		Animal v6= new Animal(12, 13, 700, "Holando", "Hembra", false, 2);
		
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
		
		System.out.println(empresa.getPromPeso());
		System.out.println(empresa.getPromEdad());
		System.out.println(empresa.getCantAnimales());
		System.out.println(empresa.getPesoTotal());
		
		CriterioEdadAnimal menor= new CriterioEdadAnimal(24);
		CriterioEdadAnimal mayor=new CriterioEdadAnimal(48);
		CriterioNot inversaMayor=new CriterioNot(mayor);
		CriterioAndAnimal and=new CriterioAndAnimal(menor, inversaMayor);
		CriterioPesoAnimal peso= new CriterioPesoAnimal(650);
		CriterioPesoConjunto pesopromedio= new CriterioPesoConjunto(600);
		System.out.println(rodeo.listoVender(pesopromedio));
		System.out.println(empresa.buscar(peso));
		
		Ministerio ministerio=new Ministerio("Ministerio");
		Categoria lechal= new Categoria("lechal", peso);
		Categoria novillo= new Categoria("novillo", and);
		ministerio.addCategoria(novillo);
		ministerio.addCategoria(lechal);
		System.out.println(ministerio.CategoriasdeAnimal(v1));
		
		
		

	}

}
