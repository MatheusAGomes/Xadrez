package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

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
			return false;
		}
		
		
		
	}
	public char[] Read(int i)
	{
		String line = null;
		String BRANCAS = "Brancas Venceram";
		String PRETAS = "Pretas Venceram";
		String EMPATE = "Empate";
		try(BufferedReader br = new BufferedReader(new FileReader("ListaDeJogadas.txt")))
		{
			for (int j = 0; j <= i; j++) {
				line = br.readLine();
				
			}

			if(line != null)
			{
				if(!line.equals(BRANCAS)&&!line.equals(PRETAS)&&!line.equals(EMPATE)) {
					char[] vetor = line.toCharArray();
					br.close();
					//System.out.print(i);
					return vetor;
				}
				else
				{
					return null;
				}
			
			}
			
			
			
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				return null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		return null;
		
	}
	public String LerResultado()
	{
		String line = null;
		String ultimaLinha = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader("ListaDeJogadas.txt")))
		{	
			line = br.readLine();
			while(line != null){
				ultimaLinha = line;
				
				line = br.readLine();
			}
		}
			catch (Exception e) {
				// TODO: handle exception
		}
			
			return ultimaLinha;
		
	}
	
	public String[] ReadCabecario()
	{
		String line = null;
		String[] vetor = new String[3];
		
		try(BufferedReader br = new BufferedReader(new FileReader("ListaDeJogadas.txt")))
		{
			
				line = br.readLine();
				
				
				vetor[0]= line;
				line = br.readLine();
				vetor[1] = line;
				line = br.readLine();
				vetor[2] = line;
			
			br.close();
			
			
			
			return vetor;
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
