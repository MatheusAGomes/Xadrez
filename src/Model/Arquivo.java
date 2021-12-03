package Model;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {

	public static boolean Write(String Caminho,String Texto)
	{
		try {
			FileWriter arq = new FileWriter(Caminho,true);
			PrintWriter gravaArqvio = new PrintWriter(arq);
			gravaArqvio.print(Texto);
			gravaArqvio.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
			return false;
		}
		
		
		
	}

}
