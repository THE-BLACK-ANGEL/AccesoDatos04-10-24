package Buscar_Cadena;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class buscarCadena {

	public static void main(String[] args) {
        try {
            String documento="";
            String texto ="";
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el nombre de la pagina en la que se buscara el texto : ");
            documento =sc.nextLine();
            System.out.println("El texto que se buscará en la siguiente página es :");
            texto = sc.nextLine();
            buscar(documento,texto);

            sc.close(); 
        } catch (Exception e) {
            
        }
	
	}
	
	public static void buscar(String  documento, String texto) {

		try {
			File archivo = new File(documento);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			// acceso secuencial al fichero
			//buscar el nombre juan
            System.out.println("Introduzca texto a buscar : ");
			String linea  ="";
			boolean encontrado=false;
			String nombreABuscar=texto;
				while((linea=br.readLine())!=null && !encontrado){
					if(linea.equalsIgnoreCase(nombreABuscar)) {						
						encontrado=true;
					}
				}
				if(encontrado)
					System.out.println("Hemos encontrado en el archivo el nombre: "+nombreABuscar);
				else
					System.out.println("No hemos encontrado en el archivo el nombre: "+nombreABuscar);
				br.close();
				fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}
	
	

}
