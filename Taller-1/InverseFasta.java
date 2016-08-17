package Taller1;

public class InverseFasta {

	public StringBuilder cadena;
	public InverseFasta(StringBuilder cadena){
		this.cadena = cadena;
	}
	public String getCadena(){
		StringBuilder sb =  new StringBuilder();
		String aux="";
		for (int i = 0; i < cadena.length(); i++){
			int a = (int)cadena.charAt(i);
			if(a==10){
				StringBuilder linea = new StringBuilder(aux);
				sb.append(linea.reverse()+"\n");
				aux="";
			}else{
				aux+=invertir(cadena.charAt(i));
			}
		}
		return sb.substring(0,sb.length()-1);
	}
	public char invertir(char c){
		if(c=='T' || c=='U')
			return 'A';
		else if (c=='A')
			return 'T';
		else if (c=='C')
			return 'G';
		else if (c=='G')
			return 'C';
		else
			return c;
	}
}
