public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String enfermedad;
    protected String prioridad;

    public Paciente (String nombre, String enfermedad, String prioridad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente arg0) {
        return prioridad.compareTo(arg0.prioridad);
    }

    @Override
    public String toString () {
        return (nombre+","+enfermedad+","+prioridad);
    }
    
}
