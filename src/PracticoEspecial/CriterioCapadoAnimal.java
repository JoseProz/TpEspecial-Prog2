package PracticoEspecial;

public class CriterioCapadoAnimal implements CriterioAnimal {
	
		public CriterioCapadoAnimal() {
			
			
		}

		public boolean Cumple(Animal g) {
			return g.Capado();
		}
		

}
