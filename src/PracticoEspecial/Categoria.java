package PracticoEspecial;

public class Categoria {
String nombre;
Criterio c1;
public Categoria(String n, Criterio cc1) {
	this.nombre=n;
	this.c1=cc1;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Criterio getC1() {
	return c1;
}
public void setC1(Criterio c1) {
	this.c1 = c1;
}

public boolean CumpleCriterio(Ganaderia g) {
	return c1.compare(g);
}

}
