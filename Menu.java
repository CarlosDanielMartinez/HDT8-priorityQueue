import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {

    Path path = Paths.get("Pacientes.txt");
    Scanner scan = new Scanner(System.in);
    List<String> lines;

    // JCF
    PriorityQueue<Paciente> pacient = new PriorityQueue<Paciente>();
    
    // Leyendo el archivo txt
    VectorHeap<Paciente> pacientes = new VectorHeap<Paciente>();

    public Menu () {
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            Logger.getGlobal().log(Level.SEVERE, "There was an error", e);
        }
    }

    //Menu
    public void menu () {
        
        boolean active = true;
        while (active) {
            System.out.println("Registro de pacientes");
            System.out.println("1. Agregar paciente\n2. Retirar Paciente\n3. Salir");
            switch (scan.nextLine()) {
                case "1":
                    agregarPaciente();
                    break;

                case "2":
                    retirarPaciente();
                    break;
                
                case "3":
                    active = false;
                    break;
            
                default:
                    System.out.println("Comando invalido");
                    break;
            }
        }
    }

    private void agregarPaciente () {
        
        if (lines.size() > 0) {
            String line = lines.remove(0);
            agregarPaciente(line);
            return;
        }
        
        System.out.println("No hay mas pacientes en el archivo pacientes.txt");
        System.out.println("Registrando nuevo paciente.\nIngrese los datos de la siguiente forma:");
        System.out.println("nombre del paciente, enfermedad, prioridad");
        agregarPaciente(scan.nextLine());
    }
    
    private void agregarPaciente (String line) {
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
        System.out.println("Paciente ingresado:\n"+paciente.toString());
    }
    
    private void retirarPaciente () {
        System.out.println("Retirando paciente");
        System.out.println("JCF: " + pacient.remove().toString());
        System.out.println("VectorHeap: " + pacientes.remove().toString());
    }
}
