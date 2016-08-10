package Taller1;
import java.util.*;
import java.io.*;
public class MainFasta {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea="";
		StringBuilder sb = null;
		StringBuilder salida = new StringBuilder();
		while( (linea=bf.readLine())!=null && !linea.equals("")){
			if(linea.charAt(0)=='>'){
				if(sb!=null)
					salida.append(new Fasta(sb).getCadena());
				sb = new StringBuilder();
			}
			sb.append(linea);
			sb.append("\n");
		}
		if(sb!=null){
			salida.append(new Fasta(sb).getCadena());
			System.out.print(salida.toString());
		}
	}

}
