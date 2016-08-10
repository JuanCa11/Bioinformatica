package Taller1;

public class Fasta {
	public StringBuilder cadena;
	public Fasta(StringBuilder cadena){
		this.cadena = cadena;
	}
	public String getCadena(){
		return cadena.substring(1,cadena.length());
	}
}
