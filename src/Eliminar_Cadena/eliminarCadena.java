package Eliminar_Cadena;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class eliminarCadena {

	public static void main(String[] args) {
		String archivo = "nombres"; // Ruta del archivo
		String palabraAEliminar = "juan"; // Palabra a eliminar

		try {
			// Leer todo el contenido del archivo
			String contenido = new String(Files.readAllBytes(Paths.get(archivo)));

			// Reemplazar la palabra deseada con una cadena vacía
			contenido = contenido.replaceAll("\\b" + palabraAEliminar + "\\b", "");

			// Escribir el contenido modificado de nuevo al archivo
			Files.write(Paths.get(archivo), contenido.getBytes());

			System.out.println("La palabra '" + palabraAEliminar + "' ha sido eliminada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
