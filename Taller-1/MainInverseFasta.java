package Taller1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainInverseFasta {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String linea="";
		StringBuilder sb = null;
		StringBuilder salida = new StringBuilder();
		while( (linea=bf.readLine())!=null && !linea.equals("")){
			if(linea.charAt(0)=='>'){
				if(sb!=null)
					salida.append(new InverseFasta(sb).getCadena());
				sb = new StringBuilder();
			}
			sb.append(linea.charAt(0)!='>'?linea:"");
			sb.append("\n");
		}
		if(sb!=null){
			salida.append(new InverseFasta(sb).getCadena());
			System.out.print(salida.toString());
		}
	}

}
