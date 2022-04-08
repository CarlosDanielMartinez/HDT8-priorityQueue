import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		// JCF
		PriorityQueue<String> pacient = new PriorityQueue<String>();
		
		
		
		// AGREGANDO LAS LETRAS A.B, C, D y E
		
		// Leyendo el archivo txt
		VectorHeap<String> pacientes = new VectorHeap<String>();
		HashMap <String, List<String>> map = new HashMap <String, List<String>> ();
		List<List<String>> expedientes = new ArrayList<List<String>>();
		
		List<String> lines = null ;
		try {
		    lines = Files.readAllLines(Paths.get("C:\\Users\\carlo\\OneDrive\\Documentos\\4to año\\Algoritmos y Estructura de datos\\HDT\\8 colas con prioridad\\Pacientes2.txt"));
		    
		    for (String line : lines) {
		        String[] array = line.split(",");
		        String nombre = array.length > 0 ? array[0] : "";
		        String enfermedad = array.length > 1 ? array[1] : "";
		        enfermedad = enfermedad.replace(" ", "");
		        String tipo = array.length > 2 ? array[2] : "";
		        tipo = tipo.replace(" ", "");
		        
		        // Agregando el tipo de prioridad
		        pacientes.add(tipo);
		        pacient.add(tipo);
		        System.out.println(tipo);
		        
		        // Creando la lista
		        List<String> valor = Arrays.asList(nombre, enfermedad,tipo);
		        
		        expedientes.add(valor);
		        
		        //System.out.println(tipo);
		        
		        /*
		        // Agregando las claves y valores al mapa
		        map.put(tipo, valor);
		        
		        */
		        
		        
		        
		        //System.out.printf("Nombre: %s%nEnfermedad: %s%nTipo: %s%n", nombre, enfermedad, tipo);
		        //System.out.println("*******************");
		    }
		    System.out.println("Done");
		} catch (IOException e) {
		    Logger.getGlobal().log(Level.SEVERE, "There was an error", e);
		}
		
		/*
		for (String x: map.get("E")) {
			System.out.println(x);
		}*/
		
		//System.out.println(map.get("A"));
		
		
		// -------------------AGREGAR PACIENTE
		// Preguntar nombre
		// Preguntar enfermedad
		// Preguntar prioridad (LETRA)
		
		
		
		
		
		
		/*
		ArrayList<String> texto = new ArrayList<String>();
		ArrayList<ArrayList<String>> texto1 = new ArrayList<ArrayList<String>>();
		try {
			
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\carlo\\OneDrive\\Documentos\\4to año\\Algoritmos y Estructura de datos\\HDT\\8 colas con prioridad\\Pacientes2.txt"));
			
			String linea;
			
			while((linea = reader.readLine()) != null) {
				
				String[] datos = linea.split(" ");
				
				for(String i : datos) {
					
					String palabra = i.replaceAll("[,.]", "");
					
					texto.add(palabra);
					
				}
				
				texto1.add(texto);
				//texto.clear();
				
			}
			
			reader.close();
			
		} catch(IOException e) {
			
			System.out.println("HAY UN ERROR CON LA DIRECCCION DEL ARCHIVO O NO FUE POSIBLE LEERLO");
			
	}*/
		
		pacientes.add("a");
		pacientes.add("b");
		pacientes.add("c");
		pacientes.add("d");
		
		for (int  i=0;i<expedientes.size();i++) {
			System.out.println(pacient.remove());
			
		}
		System.out.println(pacientes);
	}
	
}
