package PracticoEspecial;

public class Categoria {
String nombre;
CriterioAnimal c1;
public Categoria(String n, CriterioAnimal cc1) {
	this.nombre=n;
	this.c1=cc1;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public CriterioAnimal getC1() {
	return c1;
}
public void setC1(CriterioAnimal c1) {
	this.c1 = c1;
}

public boolean CumpleCriterio(Animal a) {
	return c1.Cumple(a);
}

}
