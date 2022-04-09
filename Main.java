import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		
		// JCF
		PriorityQueue<Paciente> pacient = new PriorityQueue<Paciente>();
		
		// AGREGANDO LAS LETRAS A.B, C, D y E
		
		// Leyendo el archivo txt
		VectorHeap<Paciente> pacientes = new VectorHeap<Paciente>();
		try {
		    Path path = Paths.get("Pacientes.txt");
			Scanner scanner = new Scanner(path);
		    
		    while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
		        String[] array = line.split(",");
		        String nombre = array.length > 0 ? array[0] : "";
		        String enfermedad = array.length > 1 ? array[1] : "";
		        enfermedad = enfermedad.replace(" ", "");
		        String prioridad = array.length > 2 ? array[2] : "";
		        prioridad = prioridad.replace(" ", "");

				Paciente paciente = new Paciente(nombre, enfermedad, prioridad);
		        
		        // Agregando el tipo de prioridad
		        pacientes.add(paciente);
		        pacient.add(paciente);
		        System.out.println(paciente.toString());
		    }

		    System.out.println("Done");
		} catch (IOException e) {
		    Logger.getGlobal().log(Level.SEVERE, "There was an error", e);
		}
		
		for (int i = pacient.size() ;i > 0; i--) {
			System.out.println(pacient.remove().toString());
			
		}

		for (int i = pacientes.size(); i > 0; i--) {
			System.out.println(pacientes.remove().toString());
		}
			
	}
	
}
