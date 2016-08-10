package Taller1;
import java.io.*;
import java.util.*;

public class MainFastaQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea="";
		StringBuilder sb = null,sb2 = null;
		StringBuilder salida = new StringBuilder();
		boolean estado=false;
		int cont = 0;
		while( (linea=bf.readLine())!=null && !linea.equals("") ){
			if(linea.charAt(0)=='@'){
				sb = new StringBuilder();
				cont=0;
			}
			if(linea.charAt(0)=='+'){
				sb2 = new StringBuilder();
				int cont2=0;
				while( cont2<cont ){
					linea = bf.readLine();
					cont2+=linea.length();
					sb2.append(linea);
					sb2.append("\n");
				}
				if (cont2>cont)
					System.out.println("La sequencia de calidad no es del mismo tamaño de la sequencia");
				else
					salida.append(new FastaQ(sb,sb2).getCadena());
					
			};
			cont+=(linea.charAt(0)!='@')?linea.length():0;
			sb.append(linea);
			sb.append("\n");
		}
		if(sb!=null){
			System.out.print(salida.toString());
		}
	}

}
