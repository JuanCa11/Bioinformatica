package Taller1;

public class FastaQ {
	public StringBuilder cadena;
	public StringBuilder calidad;

	public FastaQ(StringBuilder cadena,StringBuilder calidad) {
		this.cadena = cadena;
		this.calidad = calidad;
	}

	public String getCadena() {
		StringBuilder sb =  new StringBuilder();
		sb.append(cadena.toString());
		String aux = calidad.toString();
		for (int i = 0; i < aux.length(); i++) {
			int a = (int)aux.charAt(i);
			if(a==10)
				sb.append("\n");
			else
				sb.append(i==(aux.length()-2)?a:a+",");
		}
		return sb.toString();
	}
}
