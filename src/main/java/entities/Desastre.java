package entities;

import java.util.Date;

public class Desastre {
private int id;
private Date fecha;
private String tipo;
private String distrito;
private int numDam;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getDistrito() {
	return distrito;
}
public void setDistrito(String distrito) {
	this.distrito = distrito;
}
public int getNumDam() {
	return numDam;
}
public void setNumDam(int numDam) {
	this.numDam = numDam;
}
public Desastre(int id, Date fecha, String tipo, String distrito, int numDam) {
	super();
	this.id = id;
	this.fecha = fecha;
	this.tipo = tipo;
	this.distrito = distrito;
	this.numDam = numDam;
}
public Desastre() {
	super();
	// TODO Auto-generated constructor stub
}

}
