package udla.mvera.salaemergencias;
import java.util.List;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class AtencionPaciente {
    public static List<Paciente> listaDePacientes(){
        return Arrays.asList(
                new Paciente("Isaac", Gravedad.Menor),
                new Paciente("Victor", Gravedad.Severo),
                new Paciente("Alejandra", Gravedad.Moderado),
                new Paciente("Hans", Gravedad.Severo),
                new Paciente("Jessica", Gravedad.Moderado),
                new Paciente("Sebastian", Gravedad.Moderado),
                new Paciente("Adrian", Gravedad.Muy_Severo),
                new Paciente("Joseph", Gravedad.Severo),
                new Paciente("Tomas", Gravedad.Menor),
                new Paciente("Sebas", Gravedad.Severo),
                new Paciente("Esteban", Gravedad.Menor),
                new Paciente("Mathias", Gravedad.Moderado),
                new Paciente("Josue", Gravedad.Menor),
                new Paciente("Pablo", Gravedad.Severo),
                new Paciente("Mell", Gravedad.Muy_Severo)

        );
    }

    public static void main(String[] args) {
        Queue<Paciente> prioridadAtencion = new PriorityQueue<>(listaDePacientes());
        int numDePacientes = prioridadAtencion.size();
        for(int i=0; i<numDePacientes; i++){
            Paciente pacienteAtendido = prioridadAtencion.poll();
            String name = pacienteAtendido.getName();
            String gravedad = pacienteAtendido.getGravedad().getDescripcion();
            System.out.println("Nivel de atención : " + name + " con gravedad : " + gravedad);
        }
    }
}
